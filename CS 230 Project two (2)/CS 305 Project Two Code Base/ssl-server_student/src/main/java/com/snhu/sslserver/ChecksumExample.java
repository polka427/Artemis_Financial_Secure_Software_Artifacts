
public class ChecksumExample {

}
import java.security.MessageDigest;
import java.util.Base64;

public class ChecksumExample {
    public static void main(String[] args) throws Exception {
        String data = "Sensitive financial data";

        // Generate SHA-256 checksum
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(data.getBytes());

        // Print checksum
        String checksum = Base64.getEncoder().encodeToString(hash);
        System.out.println("Checksum: " + checksum);
    }
}