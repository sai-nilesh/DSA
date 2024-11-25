package Basic_Recursion;

public class SumOfSeries {
    static long sumOfSeries(long n) {
            // code here
               if(n<=0){
               return 0;
           }
            
            return (n*n*n) + sumOfSeries(n-1);
        }
        public static void main(String[] args) {
            System.out.println(sumOfSeries(5));
    }
}
