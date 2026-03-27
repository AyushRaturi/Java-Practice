/* Q72
        1 
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1
*/


import java.util.Scanner;

public class pattern35{

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }

    public static void pattern (int n){



        int space = n-1;
        int patternsize = 1;

        
        for(int i=1;i<=n;i++){

            for(int j=1;j<= space;j++){
                System.out.print("  ");    
            }

            int m = 2*i -1;

            for(int z=1;z<= patternsize;z++){
               System.out.print(m + " ");
               m--;
                
            }

            space --;
            patternsize +=2 ; 
            
            
            
            System.out.println();

        }


    }





}