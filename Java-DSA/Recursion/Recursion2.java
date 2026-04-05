// print each digit of a number from right to left by using recursion
public class Recursion2 {
    public static void main(String[] args) {
        recursion(586);
    }    



    public static void recursion(int n) {
        if(n==0)
            return;
        System.out.println(n%10);
        recursion(n/10);
    }
}

