// Q3 generate table of no 


public class Recursion3 {
static int count = 1;
    public static void main(String[] args) {
        recursion(3);
       
    
    }    



    public static int recursion(int n) {
        if(count>10)
            return 1;
        System.out.println(n*count++);
        return recursion(n);
    }
}


