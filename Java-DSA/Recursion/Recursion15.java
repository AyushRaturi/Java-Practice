// Q15 nth term of tribonacci Series 


public class Recursion15 {
    public static void main(String[] args) {
       int sum = recursion(4);
       System.out.println(sum);
    }    



    public static int recursion(int n) {
        if (n == 0) 
        return 0;

        if(n==1 || n == 2)
        return 1 ;

    
        return recursion(n-1) + recursion(n-2) + recursion(n-3);
    }
}


