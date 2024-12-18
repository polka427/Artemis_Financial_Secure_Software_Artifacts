import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESCipherExample {
    public static void main(String[] args) throws Exception {
        // Generate AES Key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // Set key size
        SecretKey secretKey = keyGen.generateKey();

        // Encrypt data
        String data = "Sensitive financial data";
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedData = cipher.doFinal(data.getBytes());

        // Print encrypted data
        System.out.println("Encrypted Data: " + Base64.getEncoder().encodeToString(encryptedData));
    }
}
