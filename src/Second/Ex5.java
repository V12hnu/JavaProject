package Second;
import java.util.StringTokenizer;
/**
 * Created by vishnu on 25/06/18.
 */
public class Ex5 {
    public static void main(String[] args) {
       /* String s1="A";
        String s2="a";
        String s="hihello fff";
        int n=5;
        System.out.println(s1.compareTo(s2));
        System.out.println(s.substring(3,n));
        char ch[]={'h','g','s','a'};
        String s3=new String(ch);
        String s5="hi,hello,world";
        System.out.println(s3.substring(3));
        String s4="Hello World";
        System.out.println(s4.trim());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.charAt(2)+" "+" length= "+s4.length());
        String[] s6=s5.split(",");
        for(int i=0;i<s6.length;i++)
             System.out.println(s6[i]);

        for(String o:s6)
            System.out.println(o);

        char[] ch1=s5.toCharArray();
        for(char a:ch1)
            System.out.print(a);
        System.out.println();
        StringBuffer s7=new StringBuffer("hello");//thred safe
        System.out.println(s7.append("heeeeey"));
        StringBuilder s8=new StringBuilder("hello world");//non syncronised/not thread safe

        System.out.println(s8);

*/


       StringTokenizer tokenizer=new StringTokenizer("hi, how, are,you",",");
       while(tokenizer.hasMoreTokens()){
           System.out.println(tokenizer.nextToken());
       }


    }
}
