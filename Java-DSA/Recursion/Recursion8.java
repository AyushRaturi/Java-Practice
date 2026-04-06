// Q7 Factiorial of a number using recursion


public class Recursion8 {

    public static void main(String[] args) {

        int sum = recursion(2);
        System.out.println(sum);
    }    



    public static int recursion(int n) {
           if(n==0 || n==1)
            return 1;

           return recursion(n-1) + recursion(n-2) ;
    }
}


