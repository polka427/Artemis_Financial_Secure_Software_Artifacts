import javax.crypto.Cipher:
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESUtil {
	private static final String ALGORITHM = "AES";
	private static final int KEY_SIZE = 256;
	
	public static String encrypt(String data, SecretKey key) throws Exception {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(CipherENCRYPT_MODE,key);
		byte[] encryptedData = cipher.doFinal(data.getBytes());
		return Base64.getEncoder().encodeToString(encryptedData);
	}
	public static String decrypt(String encryptedData, SecretKey key)throws Exception
	Cipher cipher = Cipher.getInstance(ALGORITHM);
	cipher.init(Cipher.DECRYPT_MODE, key);
	byte[] decodedData = Base64.getDecoder().decode(encryptedData);
	return new String(cipher.doFinal(decodedData));
	
	public static SecretKey generateKey() throws Exception {
		KeyGenerator keyGen = KeyGenerator.getinstance(ALGORITHM);
		keyGen.init(KEY.SIZE);
		return keyGen.generateKey();
		
	}
}