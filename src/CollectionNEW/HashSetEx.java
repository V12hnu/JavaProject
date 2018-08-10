package CollectionNEW;

import java.util.*;

/**
 * Created by vishnu on 07/07/18.
 */
public class HashSetEx {

    public static void main(String[] args) {
        LinkedHashSet<String> al=new LinkedHashSet<>();
        al.add("abc");
        al.add("aaa");
        al.add("bbb");

        for(String o:al)
            System.out.println(o);

        TreeSet<String>b=new TreeSet<>();
        b.add("vvv");
        b.add("eee");
        for(String s:b)
            System.out.println(s);


        System.out.println("-------------------------");
        HashMap<String,Integer> c=new HashMap<>();
        c.put("aaa",123);
        c.put("bbb",232);
        c.put("eee",5454);
        System.out.println(c.get("aaa"));
        //c.remove("eee");
        for(Map.Entry<String,Integer> obj : c.entrySet()){
            System.out.println(obj.getKey());
            System.out.println(obj.getValue());
        }


    }
}
