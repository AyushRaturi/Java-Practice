/* Q69
        5 
      4 4 4
    3 3 3 3 3
  2 2 2 2 2 2 2
1 1 1 1 1 1 1 1 1

*/


import java.util.Scanner;

public class pattern32{

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
        int m = n;
        
        for(int i=1;i<=n;i++){

            for(int j=1;j<= space;j++){
                System.out.print("  ");    
            }


            for(int z=1;z<= patternsize;z++){
               System.out.print(m + " ");
                
            }

            space --;
            patternsize +=2 ; 
            m --;
            System.out.println();

        }


    }





}