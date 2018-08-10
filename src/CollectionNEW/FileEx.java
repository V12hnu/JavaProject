package CollectionNEW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by vishnu on 11/07/18.
 */
public class FileEx {

    public static void main(String[] args) throws IOException {

        FileOutputStream f=new FileOutputStream("out.txt");  //to write to a file

        String s="hello world";
        byte[] b=s.getBytes();
        f.write(b);

//        FileInputStream fin = new FileInputStream("out.txt");//to read from a file
//        int i = 0;
//        while ((i = fin.read()) != -1) {
//
//            System.out.print((char) i);
//        }
//        fin.close();
    }
}