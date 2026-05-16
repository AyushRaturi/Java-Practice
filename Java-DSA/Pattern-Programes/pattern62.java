/*
Q266



*/
import java.util.Scanner;

public class pattern7{

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

        int space = n/2;
        int patternsize = 1;
        int rowmid = n%2+1;
        int mid = n/2+1;


        for(int i=1;i<=n;i++){
            //space
            for(int j=0;j<=space;j++){ //section-1
                System.out.print("*" + "\t");
            }
            
            
            //patternsize
            for(int z=1;z<=mid;z++){ //section  - 1
            System.out.print("*" + "\t");
        }
        
             for(int j=1;j==n-2;j++){// section -3 
                if(i==1 || j==n+2 && j>mid){ 
                System.out.print("@" + "\t");}
                else
                System.out.print(" " + "\t");}
                
            }

            for(){ //section- 4

            } 



            for(){//section - 5 

            }


            if(i<mid){
                space +=1;
                patternsize-=1;
            }else{
                space -=1;
                patternsize+=1;
                
            }
            
            System.out.println();
        }
    }

}

