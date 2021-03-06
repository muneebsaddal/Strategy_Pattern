import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class TripleDESEncryptionStrategy implements EncryptionStrategy{

	public void encryptData(String plainText) {
		System.out.println("-------Encrypting data using AES algorithm-------");
	       try {
	           KeyGenerator keyGenerator = KeyGenerator.getInstance("TripleDES");
	           keyGenerator.init(112);
	           SecretKey secretKey = keyGenerator.generateKey();
	           byte[] plaintTextByteArray = plainText.getBytes("UTF8");

	           Cipher cipher = Cipher.getInstance("TripleDES");
	           cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	           byte[] cipherText = cipher.doFinal(plaintTextByteArray);

	           System.out.println("Original data: " + plainText);
	           System.out.println("Encrypted data:");
	           for (int i = 0; i < cipherText.length; i++) {
	               System.out.print(cipherText[i] + " ");

	           }
	       }
	           catch(Exception ex){
	               ex.printStackTrace();
	           }
	}
}
