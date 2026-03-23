/* EXTRA Q like 24 & 25
*/


import java.util.*;

class pattern20{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){

    // checking the odd or not
    /*  if (n%2 == 0) {
    System.out.println("Please Enter odd Number to Execute the Pattern");
        return;
    } */


    // int mid = n/2 + 1;
    int patternsize = 1 ;
    int m = n*(n+1)/2;
    for (int i=1;i<=n;i++){
        
            for (int j=1;j<=patternsize;j++){
                 System.out.print(m--+"\t"); 
            }
            
            patternsize++;
            System.out.println();  
            
        }
    }
}

