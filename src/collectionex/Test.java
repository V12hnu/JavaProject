package collectionex;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by vishnu on 21/06/18.
 */
public class Test {

    static int a=1;
    int j=1,x=0;

    Test(){
        ++a;
        ++j;


    }

    public static void display(){
        System.out.println("slkdj");
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test obj=new Test();
        Test obj1=new Test();
        Test obj2=new Test();
        System.out.println(a);
        System.out.println(obj2.j);
        System.out.println(obj1.j);
    }



}

