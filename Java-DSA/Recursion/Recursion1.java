// Q2 print valoue from 10 to 1


public class Recursion1 {
    public static void main(String[] args) {
        recursion(10);
    }    



    public static void recursion(int n) {
        if(n<1)
            return;
        System.out.println(n);
        recursion(n-1);
    }
}

