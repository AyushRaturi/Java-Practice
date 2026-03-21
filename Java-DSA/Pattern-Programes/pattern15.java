/*
  
  * * * * * * * * * * * * * 
  * * * * * * * * * * *
  * * * * * * * * *
  * * * * * * *
  * * * * *
  * * *
  * 
*/
import java.util.*;

class pattern15 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
        
    int patternsize = n ;
         for (int i=1;i<=n;i++){

            

            for (int z=1;z<=patternsize;z++){  
                    System.out.print("* ");
            }

            
            patternsize -=1; ;

            System.out.println();  
            
        }
    }
}
