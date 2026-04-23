// Q14 nth term of Fibonacci Series 


public class Recursion14 {
static int count = 0;
    public static void main(String[] args) {
       int sum = recursion(5);
       System.out.println(sum);
    }    



    public static int recursion(int n) {
        if(n==0 || n == 1)
        return n ;

    
        return (n-1) + (n-2) ;
    }
}


