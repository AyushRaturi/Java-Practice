// Q4 print sum of numbers from 1 to 100 by using recursion


public class Recursion7 {

    public static void main(String[] args) {
        int sum = recursion(3);
        System.out.println(sum);
        
    }    



    public static int recursion(int n) {
            if(n == 0)
                return 0;
        return n + recursion(n - 1);
    }
}


