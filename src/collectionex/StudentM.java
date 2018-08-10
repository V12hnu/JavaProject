package collectionex;

/**
 * Created by vishnu on 12/06/18.
 */

import java.util.ArrayList;
class StudentM {

    public static void main(String[] args) {
        Student s1 = new Student (10,"xyz",89);
        Student s2 = new Student (192,"abc",88);

        ArrayList<Student> st =new ArrayList();
        st.add(s1);
        st.add(s2);

        for(Student stlist:st){
            System.out.println("Id: "+stlist.id+"Name: "+stlist.name+"Mark"+stlist.marks);
        }

    }
}
