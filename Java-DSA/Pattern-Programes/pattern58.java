/*  
Q129



*/


import java.util.*;   

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
                System.out.print("    ");    
            }
            
            
            //patternsize
            for(int z=1;z<=patternsize;z++){
                System.out.print("*" + "   ");
                
            }   
            space +=1;
            patternsize -=2;
            System.out.println();
        }
    }

}