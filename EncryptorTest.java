
public class EncryptorTest {

    public static void main(String[] args)throws Exception {
        EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
        Encryptor aesEncryptor=new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();

        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
        
        EncryptionStrategy TripleDESStrategy=new TripleDESEncryptionStrategy();
        Encryptor TripleDESEncryptor=new Encryptor(TripleDESStrategy);
        TripleDESEncryptor.setPlainText("This is plain text");
        TripleDESEncryptor.encrypt();
    }
}