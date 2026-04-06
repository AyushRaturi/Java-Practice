// Q19 get HCF


public class Recursion6 {
    public static void main(String[] args) {
        int sum = recursion(84,36);
        System.out.println(sum);
        
    }    



    public static int recursion(int a,int b) {
            if( b == 0)
                return a ;
        
        return recursion(b, a%b);
    }
}


