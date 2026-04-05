// Q8 get power 5power3 = 125 


public class Recursion4 {
    public static void main(String[] args) {
        int sum = recursion(5,3);
        System.out.println(sum);
        
    }    



    public static int recursion(int a,int b) {
        if(b==1)
            return  a;
        
        return ( a* recursion(a,b-1) );
    }
}


