

import java.util.Scanner;

public class pattern5 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }

    public static void pattern (int n){
        // checking the odd or not
    if (n%2 == 0) {
        System.out.println("Please Enter odd Number to Execute the Pattern");
        return;
    }

        int space = 0;
        int patternsize = n;
        
        
        for(int i=1;i<=n;i++){
        int m = n/2;
        int colmid=patternsize/2+1;
        int rowmid = n/2+1;  


            //space
            for(int j=1;j<=space;j++){
                System.out.print("  ");    
            }
            
            
            //patternsize
            for(int z=1;z<=patternsize;z++){
                if(z<colmid){
                    System.out.print(m-- + " ");
                }
                else{
                    System.out.print(m++ +" ");
                }
            }

            if (i<rowmid) {
            space +=1;
            patternsize -=2;
            }else{
            space -=1;
            patternsize +=2;
            }
            System.out.println();
        }
    }

}