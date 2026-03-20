/*  pattern  
0
01
010
0101
01010
*/


import java.util.*;

class pattern11 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


 public static void pattern(int n){
        
         for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(j%2 == 0){
                     System.out.print(" 0 "); 
                    }
                else{
                    System.out.print(" 1 ");
                }
                
            }
            System.out.println();
        }
    }
}
