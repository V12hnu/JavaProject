package CollectionNEW;

/**
 * Created by vishnu on 03/07/18.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist {

    public static void main(String[] args) {
        //Generic Diclaration
        List<String> al=new ArrayList<String>();
        ArrayList<String> al2=new ArrayList<String>();
        ArrayList<String> al1=new ArrayList();
        al.add("abc");
        al.add("efg");
        al.add("xyz");
        System.out.println("Using for each");
        for(String obj:al){
            System.out.println(obj+" ");

        }
        System.out.println("Using Iterator");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }

        System.out.println();
        System.out.println("Using forloop");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i)+" ");
        }
        System.out.println();
    ArrayList<String> al3= new ArrayList<>();
        al3.add("qwe");
        al3.add("rty");

        al.addAll(al3);
        al.removeAll(al3);
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}
