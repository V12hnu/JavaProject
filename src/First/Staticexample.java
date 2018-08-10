package First;

/**
 * Created by vishnu on 22/06/18.
 */
public class Staticexample {

    int i=0;
    public static void display(){
        Staticexample obj=new Staticexample();
        System.out.println(obj.i);
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Staticexample.display();
    }

}
