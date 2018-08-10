package First;

/**
 * Created by vishnu on 24/06/18.
 */
public class Bank {

    int a;
    String b;

    Bank(int cid,String cname){
        a=cid;
        b=cname;
    }

    public static void main(String[] args) {

        Account a=new Account(123,"vishnu");
        a.display();
        a.addamt(10000);
        a.checkamt();
        a.reamt(1000);




    }

}
