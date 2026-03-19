/* pattern 
01010 on the behalf of j  
*/
import java.util.*;

class pattern7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                
                if(j%2==0)
                System.out.print("0 ");
                else 
                    System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
