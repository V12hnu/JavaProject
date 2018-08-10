package collectionex;

/**
 * Created by vishnu on 13/06/18.
 */
public class MaxEx {
    public static void main(String[] args) {
        int ar[]={10,20,55,23,64,34,90};
        int max=ar[0];

        for(int i=1;i<ar.length;i++){
            if(ar[i]>max)
                max=ar[i];
        }
        System.out.println("max is "+max);

        int min=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]<min)
                min=ar[i];
        }
         int smax=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<max && ar[i]>smax)
                smax=ar[i];
        }

        System.out.println("Second maximum is "+smax);


        int tmax=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<smax && ar[i]>tmax)
                tmax=ar[i];
        }

        System.out.println("Third largest is "+tmax);

    }

}
