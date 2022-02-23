import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Aes {
    private static final String key = "11111111111111111111111111111111";

    public static byte[] encrypt(String password) {
        try {
            // convert the key into bytes
            byte[] keyData = key.getBytes();

            SecretKeySpec secretKeySpec = new SecretKeySpec(
                keyData, "AES"
            );

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] enc = cipher.doFinal(password.getBytes());
            
            return enc;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public static byte[] decrypt(byte[] secret){
        try {
            byte[] keyData = key.getBytes();

            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "AES");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] dec = cipher.doFinal(secret);

            return dec;
        } catch(Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public static void main(String[] args) {
        byte[] enc = encrypt("krishna");

        System.out.println(new String(enc));
        System.out.println(new String(decrypt(enc)));
    }
}