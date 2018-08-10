package ashdemo;

/**
 * Created by vishnu on 29/06/18.
 */
public class Sample1main extends Sample1 {
    int add(int a,int b){
        //System.out.println("sum=  "+a+b);
        return a+b;

    }
    void display(){
        System.out.println("hello");
        super.shofn();
    }

    public static void main(String[] args) {
        Sample1main ob=new Sample1main();
       // ob.add(1,2);
        ob.display();
        System.out.println(ob.add(1,2));
        Sample1 ob2=new Sample1main();
        ob2.shofn();

    }
}
