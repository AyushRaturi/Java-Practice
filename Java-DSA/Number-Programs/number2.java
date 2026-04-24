// Prime Factors Sum
//Enter Number: 72
// 2 2 2 3 3 

import java.util.*;

class number2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        sc.close();
        primeFactor(n);
    }

    public static int primeFactor(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
                n = n / i;
            }
        }
        return sum;
    }
    
}