package CollectionNEW;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;

/**
 * Created by vishnu on 18/07/18.
 */
public class FileHW {//  GO TO FILETEST
    public static void main(String[] args) throws IOException {
        FileWriter fin = new FileWriter("HwFile.txt");

        fin.write("Java is powerful");
        fin.close();

        ArrayList<String> ar = new ArrayList<>();
        int ch1 = 0;
        char s = ' ';
        String ss=" ";
        System.out.println("Printing from file");
        FileReader fout = new FileReader("HwFile.txt");
        int i=0,count = 0;

        while ((ch1 = fout.read()) != -1) {
            System.out.print((char) ch1);
            ++count;

        }

        fout.close();

        String[] st = new String[count];
        FileReader fout1 = new FileReader("HwFile.txt");
        while ((ch1 = fout1.read()) != -1) {

            if (((char) ch1) == s)
                st[i] = ss;
            else
                ss+= Character.toString((char)ch1);
            i++;
        }

            System.out.println("\n"+st[0]+"\n");



        for (int k = 0; k < count; k++)
            ar.add(st[k]);

        Iterator itr = ar.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

//        System.out.println("\n"+count);
//            for(String obj:ar)
//                System.out.println(obj);

//            Iterator itr=ar.iterator();
//            while(itr.hasNext()) {
//                System.out.print(itr.next());
//        }

        }
    }
}

