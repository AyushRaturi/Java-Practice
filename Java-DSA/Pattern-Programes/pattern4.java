// pattern 4  plus 

import java.util.*;


class pattern4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Rows:");
      int n = sc.nextInt();
      sc.close();
      pattern(n);
    
      
}   

public static void pattern(int n) {
      if(n%2==0){
        System.out.print("Please Enter Odd Number To execute this pattern");
        return;
      }
  
    int mid = n/2+1;
  
    for (int i=1;i<=n;i++){
          for (int j=1;j<=n;j++ ){
            if(i==mid || j==mid){
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

