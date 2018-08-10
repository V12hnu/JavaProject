package collectionex;

/**
 * Created by vishnu on 29/06/18.
 */
public class ForGetterSetterEx extends ForGetterSetter{

    public static void main(String[] args) {
        ForGetterSetter f =new ForGetterSetter();
        ForGetterSetterEx a=new ForGetterSetterEx();
        a.setStudid(2);
        a.studname="xyz";
        System.out.println(a.getStudid());
        f.studname="abcd";
        f.setStudid(1);
        System.out.println(f.getStudid());
    }
}
