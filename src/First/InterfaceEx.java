package First;

/**
 * Created by vishnu on 28/06/18.
 */
public class InterfaceEx implements FirstInterface {

    @Override
    public void display() {
        System.out.println("Interface Ex");
    }

    @Override
    public int add(int x, int y) {
        return (x+y);
    }

    public static void main(String[] args) {
        InterfaceEx obj=new InterfaceEx();
        obj.add(2,3);
        obj.display();
        //or
        FirstInterface ex=new InterfaceEx();
        ex.add(2,7);
        ex.display();
    }
}
