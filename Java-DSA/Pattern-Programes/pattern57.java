/*  
Q110

1 0 1 0 1 0 1 0 1 
  1 0 1 0 1 0 1
    1 0 1 0 1
      1 0 1
        1

*/


import java.util.*;

public class pattern57 {

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
        int patternsize = n*2-1;
        
        // int rowmid = n%2+1;
        

        
        
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=space;j++){
                System.out.print("  ");    
            }
            
            
            //patternsize
            for(int z=1;z<=patternsize;z++){
                if(z%2==0){
                    System.out.print("0" + " ");
                }
                else{
                    System.out.print("1" +" ");
                }
            }   
            space +=1;
            patternsize -=2;
            System.out.println();
        }
    }

}