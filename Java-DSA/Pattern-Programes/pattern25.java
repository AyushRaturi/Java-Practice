/* Q14

        * 
      * *
    * * *
  * * * *
* * * * *

*/
import java.util.*;

class pattern25 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
        
    int patternsize = 1 ;
    int space = n-1 ;
         for (int i=1;i<=n;i++){

            for (int j=1;j<=space;j++){
                 System.out.print("  "); 
            }

            for (int z=1;z<=patternsize;z++){  
                    System.out.print("* ");
            }

            space --;
            patternsize +=1; ;

            System.out.println();  
            
        }
    }
}
