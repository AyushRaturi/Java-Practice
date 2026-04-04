/*  
Q117 IMP
          
4  3  2  1  0  1  2  3  4  
   3  2  1  0  1  2  3
      2  1  0  1  2
         1  0  1
            0


*/


import java.util.Scanner;

public class pattern55   {

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
        int m = n-1;
        
        // int rowmid = n%2+1;
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=space;j++){
                System.out.print("   ");    // 3spaces
            }
            
            int mid = patternsize/2;
            //patternsize
            for(int z=1;z<=patternsize;z++){
                if(z<=mid)
                    System.out.print(m-- + "  ");
                else
                    System.out.print(m++ + "  ");
            }
            m -= 2;
            space ++;
            patternsize -=2 ; 
            System.out.println();
        }
    }

}