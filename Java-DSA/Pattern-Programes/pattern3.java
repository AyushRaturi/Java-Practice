// pattern 3  box with 2 order 


import java.util.*;


class pattern3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Rows:");
      int n = sc.nextInt();
      pattern(n);
      sc.close();
      
}   

public static void pattern(int n) {
    for (int i=1;i<=n;i++){
          for (int j=1;j<=n;j++ ){
            if(i==1||j==1||j==n||i==n||i==2 ||j==2||j==n-1||i==n-1){
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

