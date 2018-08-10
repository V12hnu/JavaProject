package modifiers;

/**
 * Created by vishnu on 13/06/18.
 */
public class MethodOverloadEx {
    public static void sum(int a,int b){
        System.out.println("int + int "+(a+b));
    }

    public static void sum(float a, float b){
        System.out.println("float +float "+(a+b));
    }

    public static void sum(int a,float b){
        System.out.println("INT +FLOAT "+(a+b));
    }



    public static void main(String[] args) {
        sum(2,2);

    }
}



