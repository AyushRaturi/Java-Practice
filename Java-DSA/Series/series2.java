/* 

Print the below series:
3, 5, 9, 17, 33

*/


public class series2 {
    public static void main(String[] args) {
        System.out.print("Hello The series is hey : ");
        int num=3;
        int m=2;
        for(int i=0;i<10;i++){
            System.out.print(num+ " ");
            num = num+m;
            m = m*2;
        }
    }
}
