package CollectionNEW;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by vishnu on 05/07/18.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        //generic declaration
        LinkedList<String> al1=new LinkedList<>();
        al1.add("aaaa");
        al1.add(null);
        al1.add("abc");
        al1.addFirst("ccc");
        al1.addLast("ddd");

        for(String x:al1){
            System.out.println(x);
        }
        Iterator itr=al1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
