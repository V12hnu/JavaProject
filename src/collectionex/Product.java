package collectionex;

/**
 * Created by vishnu on 26/06/18.
 */
public class Product {

    public void calc(Product arr[]){

        for(Product i:arr)
        {
            if(i.price>50.0)
                System.out.println("Product id whose price is grater than 50 is "+i.productid);
        }



    }

    int productid;


    public Product(){}  //for calling calc


    public Product(int productid, String productname, float price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
    }


    String productname;

    float price;

    public static void main(String[] args) {
        Product p=new Product(12,"pen",100);
        Product p1=new Product(11,"scale",50);

        Product arr[]={p,p1};

        for (Product i : arr)

            System.out.println("Product ID = " + i.productid + ", Name = " + i.productname + ", Price = " + i.price);

       Product a=new Product();
      a.calc(arr);

    }


}
