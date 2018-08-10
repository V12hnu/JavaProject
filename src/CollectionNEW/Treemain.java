/*package CollectionNEW;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by vishnu on 10/07/18.
 */
/*public class Treemain {
    public Treemain(int pno, String name, int hno) {
        this.pno = pno;
        this.name = name;
        this.hno = hno;
    }

    int pno;
    String name;
    int hno;

    public static void main(String[] args) {
        Map<Integer,Treemain> s=new Map<>();
        TreeSearch d1 = new TreeSearch(99999999, "sjdfh", 765);
        TreeSearch d2 = new TreeSearch(88888888, "sdhsdhf", 432);
        TreeSearch d3 = new TreeSearch(77777777, "sdhfkh", 658);

        s = new TreeMap<>();
        s.put(765, d1);
        s.put(432, d2);
        s.put(658, d3);


        for (Map.Entry<Integer, TreeSearch> obj : s.entrySet()) {
            System.out.println(obj.getValue().pno);
            System.out.println(obj.getValue().name);
            System.out.println(obj.getValue().hno);
        }

        Scanner sc = new Scanner(System.in);
        //int choice=sc.nextInt();

        System.out.println("Enter a house number to find his details");
        int h=sc.nextInt();
        Search(h);

        System.out.println("Enter a new entry : Enter ph no, name and house number");
        int temp1=0,temp3=0;
        String temp2=" ";
        TreeSearch d4=new TreeSearch(temp1,temp2,temp3);
        s.put(temp3,d4);

        System.out.println("Enter a hno to delete his info");
        int temp4=sc.nextInt();
        delete(temp4);


    }
}
*/