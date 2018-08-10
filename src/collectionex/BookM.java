package collectionex;

/**
 * Created by vishnu on 12/06/18.
 */
import java.util.ArrayList;
public class BookM {
    public static void main(String[] args) {
        Book b1=new Book(222,"wwww","qwerty",1000);
        Book b2=new Book(123,"rrrr","iiiii",2000);

        ArrayList<Book> bk=new ArrayList();
        bk.add(b1);
        bk.add(b2);

        for(Book blist:bk)
            System.out.println("Book ID: "+blist.id+" Book Title: "+blist.title+" Book Author: "+blist.author+" Price:"+blist.price);

    }
}
