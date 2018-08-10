package CollectionNEW;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by vishnu on 12/07/18.
 */
public class FileEx4 {
    public static void main(String[] args) throws IOException {
        File f=new File("inputfolder","input");
        System.out.println(f.exists());
        f.mkdirs();//creates directory
        // f.exists ..checks if a file already exists
        File f1=new File("sampleFolder","File.txt");
        f1.getParentFile().mkdirs();
        f1.createNewFile();
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());

        File f4=new File("sample.txt");
        f4.createNewFile();
        FileOutputStream f5=new FileOutputStream(f4);

    }
}
