package CollectionNEW;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by vishnu on 05/07/18.
 */
public class Employee {
    String empname;
    float salary;
    String dept;

    public Employee(String empname, float salary, String dept) {
        this.empname = empname;
        this.salary = salary;
        this.dept = dept;
    }



    public void display(LinkedList<Employee> e){
        for(Employee i:e)
            System.out.println(i.dept+"  "+i.empname+" ");
    }

    public static void main(String[] args) {
        LinkedList<Employee> em=new LinkedList<>();
        Employee e1=new Employee("aaa",1000,"qqq");
        Employee e2=new Employee("bbb",12000,"www");
        Employee e3=new Employee("ccc",13000,"rrr");
        em.addLast(e1);
        em.addLast(e2);
        em.addLast(e3);
        e1.display(em);
    }
}
