// Print matrix with along with all column and rows



import java.util.*;

class pattern12 {


    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }


    public static void pattern(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print( " ("+i+ "," +j+ ") " );
            }
            System.out.println();
        }


    }
}
