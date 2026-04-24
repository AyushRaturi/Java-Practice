
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        System.out.println("Name: " + s1.name);
        System.out.println("Roll: " + s1.roll);

        Student s2 = new Student();
        System.out.println("Name: " + s2.name);
        System.out.println("Roll: " + s2.roll);

    }

    
}


