package collectionex;

/**
 * Created by vishnu on 13/06/18.
 */

import java.util.*;
import java.util.ArrayList;
public class Secondlargest {
    public static void main(String[] args) {
        int num=0,ele,temp=0,big=0,sbig=0;
        System.out.println("Enter the number of array elements");
        Scanner s = new Scanner(System.in);
              num=s.nextInt();
               ArrayList<Integer> e = new ArrayList();

            for(int i=0;i<num;i++)
                {e.add(s.nextInt());

                }

     /*        int temp;
                 temp = e(0);
        for(int i=0;i<e.size();i++){
                    for(int j=i+1;j<e.size();j++){
                        temp=e.get(i);
                        e.get(i)=e.get(j);
                        e.get(j)=temp;
                    }

                }
*/

/*

            for(int i=0;i<e.length;i++) {
                if(e.get(i) > big){
                    sbig=big;
                    big = e.get(i);
                }
                else if(e.get(i)>sbig)
                        sbig=e.get(i);

            }
*/


        System.out.println("The second largest element in ");
        for (int a : e)
            System.out.print(a+", ");

            System.out.print(" is "+e.get(1));

    }


}
