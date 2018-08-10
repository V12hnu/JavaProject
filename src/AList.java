import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;


/**
 * Created by vishnu on 12/06/18.
 */
public class AList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList();
        al.add("Ab");
        al.add("Ac");
        al.add("Ad");
        al.add(null);
        al.add("Ae");

        for(String obj:al){
            System.out.println(obj);


        }
    }
}
