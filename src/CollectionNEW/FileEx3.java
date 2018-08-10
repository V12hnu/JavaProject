package CollectionNEW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vishnu on 12/07/18.
 */
public class FileEx3 {
    public static void main(String[] args)throws IOException {
        FileWriter fout=new FileWriter("output.txt");
        fout.write("hello");
        fout.close();
        System.out.println("reading from first" );
        FileReader fin=new FileReader("output.txt");
        int ch=0;
        FileWriter s=new FileWriter("new.txt");
        while((ch=fin.read())!=-1){

            System.out.print((char)ch);
            s.write(ch);
        }
        s.close();                              //File f=new

        System.out.println();
        FileReader l=new FileReader("new.txt");
        System.out.println("reading from second file");
        int e=0;
        while((e=l.read())!=-1){
            System.out.print((char)e);
        }
    }
}
