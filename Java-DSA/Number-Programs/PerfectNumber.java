public class PerfectNumber {
    static int count = 0;
        public static void main(String[] args) {
            int n = 84;
            if(n==1){
                System.out.println("Total Factor:" + 1);
            }
            int factor = perfectnumber(n);
            System.out.println("Total Factor:" + factor);

        }   


        public static int perfectnumber(int n){
            for(int i =2;i*i<=n;i++){
                if(n%i==0){
                    int fact1 = i;
                    int fact2 = n/i;
                    if(fact1 != fact2){
                        System.out.println(fact1 + "  " + fact2);
                        count += 2;
                    }
                    else{
                        System.out.println(fact1);
                        count +=1;
                    }
                }
            }
            return count;

        }
}
