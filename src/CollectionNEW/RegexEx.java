package CollectionNEW;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;

/**
 * Created by vishnu on 19/07/18.
 */
public class RegexEx {
    public static void main(String[] args) {
        boolean b = Pattern.matches("[a-zA-Z]{5}", "AAcdE");
        System.out.println(b);
        //boolean b1=Pattern.matches("[987]",)

        System.out.println(Pattern.matches("[987]{3}[0-9]{5}", "98725365"));
        System.out.println(Pattern.matches("[a-z0-9]*[@][a-z]*[.][c][o][m]", "vishnu2233@vrnmail.com"));
        System.out.println(Pattern.matches("[0-9]{2}[/][0-9]{2}[/][2][0][0-9][0-9]", "99/03/2022"));

        Pattern p = Pattern.compile("hello");
        Matcher m = p.matcher("hello hi hello");
        boolean k = false;
        while (m.find()) {
            System.out.println("found " + m.group() + " at start index " + m.start() + " at end index " + m.end());
            k = true;
        }
            if(k==false)
                System.out.println("not found");

        //--------------------------------------------------------
        //Date

        Date today;
        SimpleDateFormat sdf;
        today=new Date();
        sdf=new SimpleDateFormat("MM/dd/yy");
        System.out.println(sdf.format(today));
    //---------------------------------------------------------------



    }




    }


