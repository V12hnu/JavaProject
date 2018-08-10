package CollectionNEW;

/**
 * Created by vishnu on 17/07/18.
 */
public class ThreadEx extends Thread {
    public void run(){
        int k=1;
        for(int i=0;i<5;i++)
            System.out.println("hi"+(k++));
        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        ThreadEx obj=new ThreadEx();
        Thread t=new Thread(obj);
        t.start();
        Thread t1=new Thread(obj);
        t1.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//       System.out.println(t.getName());
//        System.out.println(t1.getName());
       // t.run();
       // obj.start();
        System.out.println("*************");
    }
}
