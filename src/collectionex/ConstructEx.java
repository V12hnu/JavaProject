package collectionex;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 * Created by vishnu on 21/06/18.
 */
public class ConstructEx {

    int rno;
    String name;
    ConstructEx(){

    }

    ConstructEx(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }

    public static void main(String[] args) {
        ConstructEx s=new ConstructEx();
        ConstructEx s1=new ConstructEx(1,"anu");
        ConstructEx s2=new ConstructEx(2,"anju");


    }

}
