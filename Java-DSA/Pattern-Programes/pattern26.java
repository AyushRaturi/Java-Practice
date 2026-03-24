/* Q33

  0 0 0 0 0 
    1 1 1 1
      0 0 0
        1 1
          0

*/
import java.util.*;

class pattern26 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
        
    int patternsize = n ;
    int space = 1 ;
         for (int i=1;i<=n;i++){

            for (int j=1;j<=space;j++){
                 System.out.print("  "); 
            }

            for (int z=1;z<=patternsize;z++){  
                if(i%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }

            space ++;
            patternsize -=1; ;

            System.out.println();  
            
        }
    }
}
