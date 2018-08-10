package CollectionNEW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vishnu on 11/07/18.
 */
public class FileEx1 {
    public static void main(String[] args) throws IOException {


        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s = obj.readLine();
        System.out.println(" "+s);

    }
}
