/* 

* * * * * * * * * 
* *     *     * *
*   *   *   *   *
*     * * *     *
* * * * * * * * *
*     * * *     *
*   *   *   *   *
* *     *     * *
* * * * * * * * *


*/



import java.util.*;

class pattern13 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){

        // checking the odd or not
      if (n%2 == 0) {
    System.out.println("Please Enter odd Number to Execute the Pattern");
        return;
    } 

        
    int mid = n/2+1;
         for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){

                if(i==1 || j==1 || i==n || j==n || i==mid || j==mid || i+j == n+1 || i==j ){
                     System.out.print("* "); 
                    }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();  
            
        }
    }
}