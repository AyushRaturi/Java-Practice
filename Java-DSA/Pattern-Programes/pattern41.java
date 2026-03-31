/* Q79 IMP 
        0 
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4

*/


import java.util.Scanner;

public class pattern41{

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

        int space = n-1;
        int patternsize = 1;
        
        // int rowmid = n%2+1;
        

        
        int m = 0;
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<= space;j++){
                System.out.print("  ");    
            }

            int colmid = patternsize/2 +1 ;

            //patternsize
            for(int z=1;z<=patternsize;z++){
                if(z<colmid){
                    System.out.print(m-- + " ");
                }
                else{
                    System.out.print(m++ + " ");
                }

            }
            
            space --;
            patternsize +=2 ; 
            System.out.println();
        }
    }

}