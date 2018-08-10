package CollectionNEW;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vishnu on 08/07/18.
 */
public class StudentMap {
    int id;
    String name;
    int age;
    public StudentMap(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        StudentMap a1=new StudentMap(16,"lll",22);
        StudentMap a2=new StudentMap(17,"sljdf",23);
        StudentMap a3=new StudentMap(18,"sjdfh",15);

        HashMap<Integer,StudentMap> s=new HashMap();
//        s.put(12,"aaa");
//        s.put(13,"bbb");
//        s.put(14,"ccc");
        s.put(16,a1);
        s.put(17,a2);
        s.put(18,a3);
        System.out.println(s.get(a1.name));

        for(Map.Entry<Integer,StudentMap> obj:s.entrySet()){
            System.out.print(obj.getValue().id);
            System.out.print(" "+obj.getValue().name);
            System.out.println(" "+obj.getValue().age);

        }





    }
}
