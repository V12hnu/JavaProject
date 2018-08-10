package First;

/**
 * Created by vishnu on 28/06/18.
 */
public class AbsEx1 extends AbsEx {

    @Override
    int add(int x,int y) {
        return (x+y);
    }

    @Override
    void display() {

    }


    public static void main(String[] args) {
        AbsEx1 obj=new AbsEx1();
        int a =obj.add(2,3);
        System.out.println(a);
        obj.display();
        AbsEx obj1=new AbsEx1(); //AbsEx1 because abstract
        obj1.disp();
    }


}
