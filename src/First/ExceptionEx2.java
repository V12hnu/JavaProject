package First;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

/**
 * Created by vishnu on 02/07/18.
 */
public class ExceptionEx2 {
    public void check(int i) {
        if (i > 20) {

            throw new ArithmeticException("number is not valid ");

            // USE THROWS IN MAIN METHOD LINE IF YOU ARE USING JUST EXCEpTION

        }
    }
    public void display() throws IOException{  // Throws is needed only for IOExceptions
        throw new IOException("IOExcaption");
    }

    public static void main(String[] args) {
        ExceptionEx2 a = new ExceptionEx2();
        try {
            a.check(22);
            a.display();
        }
        catch (Exception e1) {

            System.out.println(e1);
        }
    }
}