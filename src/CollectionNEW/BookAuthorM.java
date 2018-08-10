package CollectionNEW;

/**
 * Created by vishnu on 11/07/18.
 */
public class BookAuthorM {
    public static void main(String[] args) {
        Author author = new Author("Jack Reacher",45);
        Book b=new Book("Lee Child",1500,"Thriller Fiction",author);

        b.display();

    }
}
