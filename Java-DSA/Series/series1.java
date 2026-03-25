/* 

Print the below series:
2 5 11 23 47 95 191 383 767 1535

*/


public class series1 {
    public static void main(String[] args) {
        System.out.print("Hello The series is hey : ");
        int num=2;
        for(int i=0;i<10;i++){
            System.out.print(num+ " ");
            num = (num*2)+1;
        }
    }
}
