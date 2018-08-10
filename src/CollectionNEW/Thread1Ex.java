package CollectionNEW;

/**
 * Created by vishnu on 17/07/18.
 */
public class Thread1Ex {

static synchronized public void display(int x){
        for(int i=0;i<5;i++)
            System.out.println(i*x);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}


}
