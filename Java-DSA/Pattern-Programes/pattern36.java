/* Q73
        1 
      2 3 4
    5 6 7 8 9
  10 11 12 13 14 15 16
17 18 19 20 21 22 23 24 25
*/


import java.util.Scanner;

public class pattern36{

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
        int m = 1;

        
        for(int i=1;i<=n;i++){

            for(int j=1;j<= space;j++){
                System.out.print("\t");    
            }


            for(int z=1;z<= patternsize;z++){
               System.out.print(m + "\t");
               m++;
                
            }

            space --;
            patternsize +=2 ; 
            
            
            
            System.out.println();

        }


    }





}