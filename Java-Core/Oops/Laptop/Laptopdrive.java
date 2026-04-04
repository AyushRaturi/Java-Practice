package Laptop;

public class Laptopdrive {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        Laptop L2 = new Laptop();


        L1.name = "Dell Inspiron"; L1.brand = "Dell"; L1.processor = "Intel i7"; L1.Ram = "16GB";
        L2.name = "MacBook Pro"; L2.brand = "Apple"; L2.processor = "M4 Pro"; L2.Ram = "16GB";

        System.out.println("Object Refernce: "+ L1);
        System.out.println();
        System.out.println("Emp 1 ID : "+ L1.name);
        System.out.println("Emp 1 Name : "+ L1.brand);
        System.out.println("Emp 1 Deparment : "+ L1.processor);
        System.out.println("Emp 1 Role : "+ L1.Ram);
        //Space
        System.out.println();
        System.out.println("Object Refernce: "+ L2);
        System.out.println();
        System.out.println("Emp 1 ID : "+ L2.name);
        System.out.println("Emp 1 Name : "+ L2.brand);
        System.out.println("Emp 1 Deparment : "+ L2.processor);
        System.out.println("Emp 1 Role : "+ L2.Ram);
    }
}
