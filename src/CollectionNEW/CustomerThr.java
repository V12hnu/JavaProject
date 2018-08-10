package CollectionNEW;

/**
 * Created by vishnu on 19/07/18.
 */
class Customer {
    int amount=10000;
    synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println("goin to withdraw..");

        if(this.amount<amount){
            System.out.println("less bal; waiting for deposit..");
            try{
                wait();
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdrawel complete..");
    }

    synchronized void deposit(int amount){
        System.out.println("Going to deposit..");
        this.amount+=amount;
        System.out.println("depsit completed..");
        notify();
    }
}

class Thread5 extends Thread{
    Customer c;
    Thread5(Customer c){
        this.c=c;
    }
    public void run(){
        try {
            c.withdraw(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class Thread6 extends Thread{
    Customer c;
    Thread6(Customer c){
        this.c=c;
    }
    public void run(){
        c.deposit(100000);
    }
}

public class CustomerThr{
    public static void main(String[] args) {
        Customer obj=new Customer();
        Thread5 t1=new Thread5(obj);
        Thread6 t2=new Thread6(obj);
        t1.start();
        t2.start();
    }
}