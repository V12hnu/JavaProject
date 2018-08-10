package collectionex;

/**
 * Created by vishnu on 29/06/18.
 */
public class AnoInterface {
    public static void main(String[] args) {

        AnoFirstInterface f=new AnoFirstInterface() {
            @Override
            public void add(int a, int b) {

            }

            @Override
            public void display() {

            }
        };


        f.add(2,4);
        f.display();


    }
}
