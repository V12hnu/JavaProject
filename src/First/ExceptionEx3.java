package First;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
/**
 * Created by vishnu on 03/07/18.
 */
public class ExceptionEx3 {
    public void first()throws IOException {
        second();
    }
    public void second()throws IOException{
        third();
    }
    public void third()throws IOException{
        throw new IOException();

    }

    public static void main(String[] args) {
        ExceptionEx3 obj=new ExceptionEx3();

        try{
            obj.first();
        }
        catch (Exception ex){
            System.out.println("exception propogated1 ="+ex);
        }


    }
}
