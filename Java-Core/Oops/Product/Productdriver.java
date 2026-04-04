package Product;

public class Productdriver{
    public static void main(String[] args) {
        Product P1 = new Product();
        Product P2 = new Product();
        Product P3 = new Product();
        Product P4 = new Product();
        

        P1.name = "Ubuntu"; P1.brand = "Linux"; P1.price = 0;
        P2.name = "Mac OS"; P2.brand = "Apple"; P2.price = 100;
        P3.name = "Chrome OS"; P3.brand = "Google"; P3.price = 10;
        P4.name = "Windows"; P4.brand = "Microsoft"; P4.price = 50;

        
        System.out.println("Object Refernce of Product 1 : "+ P1);
        System.out.println();
        System.out.println("Product Name : "+ P1.name);
        System.out.println("Product Brand: "+ P1.brand);
        System.out.println("Product Price : "+ P1.price);
        //Space P2
        System.out.println();
        System.out.println("Object Refernce of Product 1 : "+ P2);
        System.out.println();
        System.out.println("Product Name : "+ P2.name);
        System.out.println("Product Brand: "+ P2.brand);
        System.out.println("Product Price : "+ P2.price);
        //Space P3
        System.out.println();
        System.out.println("Object Refernce of Product 1 : "+ P3);
        System.out.println();
        System.out.println("Product Name : "+ P3.name);
        System.out.println("Product Brand: "+ P3.brand);
        System.out.println("Product Price : "+ P3.price);
        //Space P4
        System.out.println();
        System.out.println("Object Refernce of Product 1 : "+ P4);
        System.out.println();
        System.out.println("Product Name : "+ P4.name);
        System.out.println("Product Brand: "+ P4.brand);
        System.out.println("Product Price : "+ P4.price);
    }
}
