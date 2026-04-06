// get sum of 5 varible using 2 two sum recursion 


public class Recursion5 {
    public static void main(String[] args) {
        int sum = recursion(recursion(recursion(1, 2), 3),recursion(4,5));
        System.out.println(sum);
        
    }    



    public static int recursion(int a,int b) {
            return a+b ;
    }
}


