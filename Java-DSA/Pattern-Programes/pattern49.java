/*  
Q92 IMP

                                A
                        B       A       A
                C       B       A       A       B
        D       C       B       A       A       B       C
E       D       C       B       A       A       B       C       D

*/


import java.util.Scanner;

public class pattern49 {

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

        int space = n-1;
        int patternsize = 1;
        
        // int rowmid = n%2+1;
        

        
        
        for(int i=1;i<=n;i++){
            int m = i;
            //space
            for(int j=1;j<=space;j++){
                System.out.print("\t");    
            }
            
            int colmid = patternsize/2 + 1 ;
            
            //patternsize
            for(int z=1;z<=patternsize;z++){
                if(z<colmid){
                    System.out.print((char)(64+m--) + "\t");
                }
                else if(z==colmid) {
                    System.out.print((char)(65)+ "\t");
                    
                }
                else{
                    System.out.print((char)(64+m++) + "\t");
                }
            }
            space --;
            patternsize +=2 ; 
            System.out.println();
        }
    }

}