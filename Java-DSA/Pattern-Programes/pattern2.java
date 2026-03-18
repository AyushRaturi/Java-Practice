// box with full of star 

import java.util.*; 


class pattern2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Rows:");
      int n = sc.nextInt();
      sc.close();
      pattern(n); 
    
      
}   

public static void pattern(int n) {
    for (int i=0;i<=n;i++){
          for (int j=0;j<=n;j++ ){
            System.out.print("* ");
          }
          System.out.println();
          }
    }
}



















