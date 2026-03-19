// simple box pattern 
import java.util.*;


class pattern6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Rows:");
      int n = sc.nextInt();
      sc.close();
      pattern(n);
    
      
}   

public static void pattern(int n) {
    for (int i=1;i<=n;i++){
          for (int j=1;j<=n;j++ ){
            if(i==1||j==1||j==n||i==n){
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
