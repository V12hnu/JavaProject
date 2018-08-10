package CollectionNEW;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by vishnu on 10/07/18.
 */
public class QueueEx {
    public static void main(String[] args) {
        //Queue<String> p=new PriorityQueue<String>();
        ArrayDeque<String> p=new ArrayDeque<>();
        p.add("a");
        p.add("b");
        p.add("c");

        p.add("d");
        p.addFirst("1");//with ArrayDeque
        p.addLast("9");//with ArrayDequ
        //p.add(null); cant add null values
       //does not keep order
        for(String obj:p)
            System.out.println(obj);

        System.out.println(p.pollFirst());
        System.out.println(p.pollLast());

        System.out.println("First element "+p.element());//returns the head ele
        System.out.println("first element "+p.peek());//returns the head element and returns null if q is empty
        System.out.println("remove "+p.remove());//returns and removes the first ele
        System.out.println("remove "+p.poll());//returns and removes the first ele...returns null if the queue is empty

        System.out.println("After removl");
        for(String obj:p)
            System.out.println(obj);

    }
}
