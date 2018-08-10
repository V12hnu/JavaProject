package CollectionNEW;

/**
 * Created by vishnu on 11/07/18.
 */
public class Book {
    String name;
    int price;
    String id;
    Author obj;

    public Book(String name, int price, String id, Author obj) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.obj = obj;
    }

    public void display(){

        System.out.println("Book Title : "+name+" ,Author : "+obj.name+"("+obj.age+") Book price = "+price+", Type = "+id);

    }


}
