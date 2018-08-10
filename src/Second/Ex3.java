package Second;
import First.*;
/**
 * Created by vishnu on 22/06/18.
 */
public class Ex3 {
    static int i;

    static class StaticEx {
        static void display(){
         int k=10;
            System.out.println(k);
        }

    }


    public static void main(String[] args) {
        System.out.println(i);
        Ex3.StaticEx.display();
        Staticexample.display();

        Ex3.StaticEx obj = new Ex3.StaticEx();
        obj.display();

        StaticEx obj1=new StaticEx();
        obj1.display();
    }

}