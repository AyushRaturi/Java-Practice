//TowerofHonoi


public class TowerofHonoi {
    public static void main(String[] args) {
        recursion(3, 'A','B','C');  
    }    



    public static void recursion(int n , char source, char auxilary , char destination) {
            if( n == 1){
            System.out.println("Move from " + source + "to" + destination);
            return;
            }

            recursion(n-1, source , destination ,auxilary);
            System.out.println("Move from " + source + "to" + destination);
            recursion(n-1, auxilary, source, destination);
    
    }
}


