package collectionex;
import java.util.Random;
/**
 * Created by vishnu on 19/06/18.
 */
public class Shuffle {
    public static void main(String[] args) {
        int ar[] = {5, 10, 15, 20, 25};
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        System.out.println();
        Random r = new Random();

        int[] aa = new int[ar.length];
        int[] ab =new int[ar.length];
        int[] ac =new int[ar.length];
        int m=0,k = 0, l=0,update=0;
        l = r.nextInt(ar.length);
        System.out.print(ar[l] + " ");

        for (int i = 0;update==0; i++) {

            ac[m] = r.nextInt(ar.length);

            while (ac[m]!=ac[m-1]||ac[m]!=ac[m+1]) {
                ab[i]=aa[l];

                if(ab.length==ar.length)
                    update++;
                System.out.println(update);
                m++;
            }

             for(int j=0;j<ar.length;j++)
                 System.out.println(ab[j]+" ");
        }


    }


}