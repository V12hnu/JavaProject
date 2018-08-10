


package collectionex;



import java.util.Random;
/**
 * Created by vishnu on 18/06/18.
 */
public class RandomEx {
    public static void main(String[] args) {
        Random r = new Random();
        String a1 = "abcdefghijklmnopqABCDEFGHIJKLMNOPQRSTUVWXYZrstuvwxyz123456789";

        r = new Random();


        int len=8;
        char[] pass =new char[len];
        for(int j=0;j<len;j++){
            pass[j]=a1.charAt(r.nextInt(a1.length()));
        }
        for(int i=0;i<len;i++)
            System.out.print(pass[i]);

    }
}