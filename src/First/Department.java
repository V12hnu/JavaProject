package First;

/**
 * Created by vishnu on 23/06/18.
 */
public class Department {


        int dep_id;
        String dep_name;


        Department(int id,String name){
            dep_id=id;
            dep_name=name;
            System.out.println(id);
            System.out.println(name);

        }


    public void getDetails()
    {
        System.out.println("Parent Method");
    }

}
