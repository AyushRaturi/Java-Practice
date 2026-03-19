/* if n=12326:
Sum of extremes: 1 + 6 = 7
Sum of mean digits: 2 + 3 + 2 = 7
Since the sums are equal (7=7), 12326 is a Xylem number.
and if n=36985:
Sum of extremes: 3 + 5 = 8
Sum of mean digits: 6 + 9 + 8 = 23
Since the sums are not equal (8≠23), 36985 is a Phloem number. 

*/

// "static void main" must be defined in a public class.

import java.util.Scanner;

public class xylem {

    public static boolean isXylem(int n) {

        int exitsum = n % 10;
        int midsum = 0;

        n /= 10;

        while (n > 9) {
            midsum = midsum + n % 10;
            n /= 10;
        }

        return midsum == exitsum + n;
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Check :");
        int n = sc.nextInt();
        sc.close();
         




        if (isXylem(n)) {
            System.out.println("XYLEM");
        } else {
            System.out.println("PHLOEM");
        }

    }
}