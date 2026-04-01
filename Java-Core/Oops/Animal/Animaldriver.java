package Animal;

public class Animaldriver {
    public static void main(String[] args) {
        Animal a1= new Animal();
        Animal a2= new Animal();

        a1.name = "Lion"; a1.type = "Wild";
        a2.name = "Dog"; a2.type = "Domestic";

        
        System.out.println("Object Refernce: "+ a1);
        System.out.println();
        System.out.println("Emp 1 ID : "+ a1.name);
        System.out.println("Emp 1 Deparment : "+ a1.type);

        System.out.println();
        System.out.println("Object Refernce: "+ a2);
        System.out.println("Emp 1 Name : "+ a2.name);
        System.out.println("Emp 1 Role : "+ a2.type);
    }
}
