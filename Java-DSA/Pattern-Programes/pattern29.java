/*  


1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

*/

import java.util.Scanner;

    public class pattern29 {

    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }

    

    public static void pattern(int n){

        
        int patternsize = 1;
        
        
        for(int i=1;i<=n;i++){
            
           
            int m=i;


            //patternsize
            for(int z=1;z<=patternsize;z++){
                System.out.print(m-- + " ");
            }

            
            System.out.println();
            patternsize +=1;
            
        }
    }
}

