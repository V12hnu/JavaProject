package CollectionNEW;

/**
 * Created by vishnu on 17/07/18.
 */
 class Thread1 extends Thread {
    Thread1Ex obj;
    Thread1(Thread1Ex obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.display(10);
    }

}

class Thread2 extends Thread {
    Thread1Ex obj2;
     Thread2(Thread1Ex obj2) {
            this.obj2 = obj2;
        }
    @Override
        public void run() {
            obj2.display(5);
        }
     }


class Thread3 extends Thread{

    Thread1Ex obj3;
     public Thread3(Thread1Ex obj3) {
        this.obj3 = obj3;
    }

    @Override
    public void run() {
        obj3.display(3);
    }
}


    public class Threadmain {

        public static void main(String[] args) {


            //        Thread1Ex ex=new Thread1Ex(5);
//        Thread1Ex ex1=new Thread1Ex(100);
//        Threadmain obj=new Threadmain(ex);
//        Threadmain obj1=new Threadmain(ex1);
//        obj.start();
//        obj1.start();

        Thread1Ex obj=new Thread1Ex();
        Thread1Ex obj1=new Thread1Ex();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        Thread1 t3=new Thread1(obj1);
        Thread1 t4=new Thread1(obj1);
        Thread3 t5=new Thread3(obj1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        }
    }
