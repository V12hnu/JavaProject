package modifiers;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.SocketPermission;

/**
 * Created by vishnu on 11/06/18.
 */
public class Student {
   int id;
   String name;

  public Student(int id,String name){
       this.id=id;
       this.name=name;
   }

    protected void display() {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);

    }



}



