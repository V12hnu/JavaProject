package CollectionNEW;

import java.io.File;
import java.io.IOException;

import static java.lang.System.in;

/**
 * Created by vishnu on 11/07/18.
 */
public class FileEx2 {
    public static void main(String[] args) throws IOException {
        File f=new File("in.txt");
        if(!(f.exists()))
            f.createNewFile();

    }
}
