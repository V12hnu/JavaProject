package collectionex;

/**
 * Created by vishnu on 18/06/18.
 */
public class Splitex {

    public static void main(String[] args) {
        int ar[] = {10, 20, 30, 40, 50, 60};
        int n = ar.length;
        int a[] = new int[n / 2];
        int b[] = new int[n - a.length];

        for (int i = 0; i < ar.length; i++)
            if (i < a.length)
                a[i] = ar[i];

            else

                b[i - a.length] = ar[i];


        System.out.println("First array");
        for (int k : a)
            System.out.println(k);

        System.out.println("Second array");
        for (int s : b)
            System.out.println(s);
    }
}