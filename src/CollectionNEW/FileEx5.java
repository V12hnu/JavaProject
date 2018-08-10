package CollectionNEW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vishnu on 19/07/18.
 */
public class FileEx5 {
    public static void main(String[] args)throws IOException{
        FileWriter fin=new FileWriter("new5.txt");
        fin.write("malayalam");
        fin.close();
        FileReader fout=new FileReader("new5.txt");
        int ch=0;
        while((ch=fout.read())!=-1)
            System.out.print((char)ch);
        System.out.println();
        ArrayList<Character> ar=new ArrayList<>();
        int ch1,i=0;
        String[] s=new String[9];
        FileReader fout1=new FileReader("new5.txt");
        while((ch1=fout1.read())!=-1){
            s[i]= String.valueOf((char)ch1);
            i++;
        }

        for(int k=0;k<9;k++) {
            if (s[k].equals("a")) {

                s[k] = "l";
            }
        }

        for(int l=0;l<s.length;l++)
            System.out.print(s[l]);

        }


    }

