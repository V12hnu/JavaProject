package ashdemo;

/**
 * Created by vishnu on 29/06/18.
 */
public class Sample2main implements Sample2 {


    public void add(int a, int b) {
        System.out.println(a+b);

    }


    public void display() {
        System.out.println("hello world");

    }

    public static void main(String[] args) {
        Sample2main ob=new Sample2main();
        ob.add(2,3);
        ob.display();
    }
}
