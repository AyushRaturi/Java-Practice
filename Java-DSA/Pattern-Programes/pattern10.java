/* patter 14 with proper solution
* * * * * 
* * * *
* * *
* *
*
*/



 
import java.util.*;

class pattern10 {

    
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
            for (int j=1;j<=patternsize;j++){

                System.out.print("* "); 

            }
            patternsize --;
            System.out.println();  
            
        }
    }
}

    

/*  way two to do same task
 
* * * * * * * * * 
* * * * * * * * 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*


import java.util.*;

class pattern10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
   
        // for checking the value of mid 
   //     System.out.println(mid);
        
        for (int i=n;i<=n;i--){
            for (int j=1;j<=i;j++){
                
                
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}


*/