/* pattern 
 1 plus 
*/
import java.util.*;

class pattern8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
   
        int mid = n/2+1;
        // for checking the value of mid 
   //     System.out.println(mid);
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                
                if(i == mid || j == mid )
                System.out.print("1 ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
