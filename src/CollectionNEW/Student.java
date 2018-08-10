package CollectionNEW;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vishnu on 03/07/18.
 */

public class Student {
    int id;
    String name;
    int age;

    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList();
        Student s1=new Student(2,"abc",23);
        Student s2=new Student(3,"lmn",22);
        Student s3=new Student(4,"xyz",23);
        al.add(s1);
        al.add(s2);
        al.add(s3);

        for( Student ob:al)
            System.out.println("ID : "+ob.id+", Name : "+ob.name+", Age : "+ob.age);


         Iterator it=al.iterator();
         while(it.hasNext()){
             Student s4=(Student) it.next();
             System.out.println("Id "+s4.id+" name "+s4.name+" age "+s4.age);
         }
    }


}

