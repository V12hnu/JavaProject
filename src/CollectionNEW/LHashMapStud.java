package CollectionNEW;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by vishnu on 09/07/18.
 */
public class LHashMapStud {
    int id, age;
    String name;
    public LHashMapStud(int id, String name, int age){
        this.id=id;
        this.age=age;
        this.name=name;

    }

    public static void main(String[] args) {

        LHashMapStud s1=new LHashMapStud(123,"aaa",22);
        LHashMapStud s2=new LHashMapStud(124,"bbb",23);
        LHashMapStud s3=new LHashMapStud(125,"rfg",24);

        LinkedHashMap<Integer,LHashMapStud> s=new LinkedHashMap<>();

       //Map<String,String>lmap=new TreeMap<>();
        s.put(123,s1);
        s.put(124,s2);
        s.put(125,s3);

        for(Map.Entry<Integer,LHashMapStud> obj:s.entrySet()){
            System.out.print(obj.getValue().id+" ");
            System.out.print(obj.getValue().age+" ");
            System.out.println(obj.getValue().name);
        }

        }
}
