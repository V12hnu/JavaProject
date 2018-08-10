package collectionex;

/**
 * Created by vishnu on 21/06/18.
 */
public class Faculty {

    String name;
    String dep;
    int fid;
    Double sal;

    Faculty(String name,String dep,int fid,Double sal){
        this.name=name;
        this.dep=dep;
        this.fid=fid;
        this.sal=sal;
    }
    void display()
   {
       System.out.println("Faculty name:"+name);
       System.out.println("Faculty department:"+dep);
       System.out.println("Faculty ID:"+fid);
       System.out.println("Faculty Salary:"+sal);
   }
    public static void main(String[] args) {

        Faculty obj=new Faculty("abc","Eng",123,10000.00);
        obj.display();

    }

}


