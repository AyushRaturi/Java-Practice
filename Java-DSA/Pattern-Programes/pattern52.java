/*  
Q115 IMP

1  2  3  4  5  4  3  2  1  
   1  2  3  4  5  4  3
      1  2  3  4  5
         1  2  3
            1
        
*/


import java.util.Scanner;

public class pattern52 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }

    public static void pattern (int n){
        // checking the odd or not
    if (n%2 == 0) {
        System.out.println("Please Enter odd Number to Execute the Pattern");
        return;
    }

        int space = 0;
        int patternsize = n*2-1;
        int mid = patternsize/2;
        
        // int rowmid = n%2+1;
        

        
        
        for(int i=1;i<=n;i++){
            int m =1;
            //space
            for(int j=1;j<=space;j++){
                System.out.print("   ");    // 3spaces
            }
            
            //patternsize
            for(int z=1;z<=patternsize;z++){
                    if (z<=mid) {
                        System.out.print(m++ + "  "); // spaces
                    }
                    else
                    System.out.print(m-- + "  "); // spaces
            }
            space ++;
            patternsize -=2 ; 
            System.out.println();
        }
    }

}