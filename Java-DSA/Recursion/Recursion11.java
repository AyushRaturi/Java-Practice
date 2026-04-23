// Q10 print   each digit of a number from left to right by using recursion


public class Recursion11 {

    public static void main(String[] args) {

        recursion(123);
    }    



    public static void recursion(int n) {
        if(n<10){
        System.out.println(n);
        return;}

        
        recursion(n/10);   // recursive call
        System.out.println(n % 10);
        return;

    }
}


