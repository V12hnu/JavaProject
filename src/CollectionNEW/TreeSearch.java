package CollectionNEW;

import java.util.Map;
import java.util.TreeMap;
import java.util.*;
/**
 * Created by vishnu on 09/07/18.
 */
public class TreeSearch {
    int pno;
    String name;
    int hno;



    public TreeSearch(int pno, String name, int hno) {
        this.pno = pno;
        this.name = name;
        this.hno = hno;
    }


    public static void Search(int a,Map<Integer,TreeSearch> m) {




          if(m.containsKey(a)) {
              System.out.println("Details of " + a + " identified");
              System.out.println("Phone Number "+m.get(a).pno);
              System.out.println("Name "+m.get(a).name);

          }



    }



    public static void delete(int b,Map<Integer,TreeSearch> m) {

      if(m.containsKey(b))
          m.remove(b);
        }



    public static void main(String[] args) {
        TreeSearch d1 = new TreeSearch(99999999, "sjdfh", 765);
        TreeSearch d2 = new TreeSearch(88888888, "sdhsdhf", 432);
        TreeSearch d3 = new TreeSearch(77777777, "sdhfkh", 658);

        Map<Integer,TreeSearch> s = new TreeMap<>();
        s.put(765, d1);
        s.put(432, d2);
        s.put(658, d3);


        for (Map.Entry<Integer, TreeSearch> obj : s.entrySet()) {
            System.out.print(obj.getValue().pno+" ");
            System.out.print(obj.getValue().name+" ");
            System.out.println(obj.getValue().hno);
        }

            Scanner sc = new Scanner(System.in);
            //int choice=sc.nextInt();

            System.out.println("Enter a house number to find his details");
            int h=sc.nextInt();
            Search(h,s);

        System.out.println("Enter a new entry :");
        int temp1=0,temp3=0;
        String temp2=" ";

        System.out.println("Enter phone number");
        temp1=sc.nextInt();
        System.out.println("Enter name");
        temp2=sc.next();
        System.out.println("enter house no.");
        temp3=sc.nextInt();
        System.out.println();
        TreeSearch d4=new TreeSearch(temp1,temp2,temp3);
        s.put(temp3,d4);
        System.out.println("Updated");
        for (Map.Entry<Integer, TreeSearch> obj : s.entrySet()) {
            System.out.print(obj.getValue().pno+" ");
            System.out.print(obj.getValue().name+" ");
            System.out.println(obj.getValue().hno);
        }

        System.out.println("Enter a hno to delete his info");
        int temp4=sc.nextInt();
        delete(temp4,s);
        System.out.println("Updated result");
        for (Map.Entry<Integer, TreeSearch> obj : s.entrySet()) {
            System.out.print(obj.getValue().pno+" ");
            System.out.print(obj.getValue().name+" ");
            System.out.println(obj.getValue().hno);
        }

    }
}