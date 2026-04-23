// Q11 get sum of each digit of a number by using recursion


public class Recursion12 {
static int count = 0;
    public static void main(String[] args) {
       int sum = recursion(123);
       System.out.println(sum);
    }    



    public static int recursion(int n) {
        if(n==0)
        return 0 ;

        
        recursion(n/10);   // recursive call
        count = count + n % 10;
        return count;


    }
}


