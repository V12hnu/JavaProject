package First;

/**
 * Created by vishnu on 24/06/18.
 */
public class Account extends Bank {


    Account(int cid,String cname){
        super(cid,cname);

   }

    public void display(){
        System.out.println("Customer ID:"+a+"and Customer name :"+b);
    }

    public void addamt(int amt ){

        System.out.println("Amount to be added "+amt);
    }

    public void reamt(int re){
        System.out.println("Amount to be retrieved "+re);

    }

    public void checkamt(){

        System.out.println("Amount to be checked");

    }
}

