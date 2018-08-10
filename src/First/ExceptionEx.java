package First;

/**
 * Created by vishnu on 02/07/18.
 */
public class ExceptionEx {
    public static void main(String[] args) {
    int a[]={1,2,0,4,5,0,9,0,8,6};
   for(int j=0;j<a.length;j++) {
       try {
           for (int i = 0; i < a.length; i++) {

               System.out.println(a[i] / 0);
           }

       } catch (Exception e) {
           System.out.println(e+" exceptions caught");
       //e.printStackTrace();
       }

       finally {
           System.out.println("finally caught");
       }


   }
    }
}
