/* Q70
        1 
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9        

*/


import java.util.Scanner;

public class pattern33{

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


            for(int z=1;z<= patternsize;z++){
               System.out.print(z + " ");
                
            }

            space --;
            patternsize +=2 ; 
            
            System.out.println();

        }


    }





}