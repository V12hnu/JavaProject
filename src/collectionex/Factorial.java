package collectionex;

/**
 * Created by vishnu on 20/06/18.
 */
public class Factorial {
    static int fact(int n){


        int f;
        if(n==1)
        return 1;
        else
            f=n*fact(n-1);
        System.out.println(f);
        return f;


    }

    public static void main(String[] args) {
        int n=5;
        int a=fact(n);
        System.out.println(a);
    }

}

