package First;

/**
 * Created by vishnu on 23/06/18.
 */
public class Faculty extends Department {

   // String name;

 // int fac_id;

    public void display(int fac,String fac_name) {
     int   fac_id=fac;
       String  name = fac_name;
        System.out.println(fac_id);
        System.out.println(name);


        System.out.println("Child Class");

    }
     Faculty(int id,String name){
        super(id,name);
         System.out.println("Child class constuctor");
     }

    public static void main(String[] args) {
    Faculty f=new Faculty(123,"xyz");

    f.getDetails();
    f.display(123,"abc");

    }

}