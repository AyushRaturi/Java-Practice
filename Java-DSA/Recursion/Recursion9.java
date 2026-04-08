// Q6 print sum of squares of numbers from 1 to 100 by using recursion


public class Recursion9 {

    public static void main(String[] args) {

        int sum = recursion(3);
        System.out.println("Sum: " + sum);
    }    



    public static int recursion(int n) {
           if(n==1)
            return 1;

           return n*n + recursion(n-1) ;
    }
}


