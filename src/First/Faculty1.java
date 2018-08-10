package First;

/**
 * Created by vishnu on 27/06/18.
 */
public class Faculty1 extends Department1{

  int facid;
    String name;
    String number;


    @Override
   public void display(){
       System.out.println("Method in child class "+name+" "+number);
   }
    public Faculty1(int dpid,String dname,int facid,String name,String number){
       super(dpid,dname);
       this.facid=facid;
       this.name=name;
       this.number=number;
        System.out.println("child class");
    }

    public static void main(String[] args) {
        Faculty1 f=new Faculty1(101,"CSE",1,"abc","8989345345");
        f.display();
    }
}
