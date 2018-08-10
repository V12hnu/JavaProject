package CollectionNEW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vishnu on 21/07/18.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        FileWriter fout = new FileWriter("Filetest.txt");
        fout.write("Vishnu is my name");
        fout.close();
        FileReader fin=new FileReader("Filetest.txt");
        int ch=0;
        int count=0, count1=0;
        System.out.println("Printing from file\n");
        while((ch=fin.read())!=-1) {
           if((char)ch==' ')
               count++;
            System.out.print((char) ch);
        }

        fin.close();
        int word=count+1,j=0;
        FileReader fin1=new FileReader("Filetest.txt");
        String[] st=new String[word];
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<word;i++) {
            String s=" ";
            while ((ch = fin1.read()) != -1) {
                if (((char) ch) == ' ') {
                    break;
                }
                else
                    s += Character.toString((char) ch);
            }
            st[j]=s;
            ar.add(st[j]);
            j++;
        }
        System.out.println("\n\nPrinting form Array List\n");
        Iterator itr=ar.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}