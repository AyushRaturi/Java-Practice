//pattern 5 nazi symbol 



import java.util.*;


class pattern5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Rows:");
      int n = sc.nextInt();
      sc.close();
      pattern(n);
    
      
}   

public static void pattern(int n) {
    int mid = n/2+1;
  
    for (int i=1;i<=n;i++){
          for (int j=1;j<=n;j++ ){
            if(i==mid || j==mid || i==1 && j>mid || j==n && i > mid || j==1 && i < mid || i==n && j< mid ){
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
