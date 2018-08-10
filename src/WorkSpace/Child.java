package WorkSpace;

/**
 * Created by vishnu on 02/07/18.
 */
public class Child extends Parent {

    void display(){
        System.out.println("Printing from child class");
        super.display1();//
    }



    public static void main(String[] args) {


        Child ch=new Child();
        ch.display();
        Parent p=new Child();//One way to call objects of the parent class
        p.display1();


    }
}
