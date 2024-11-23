public class sumOfDivisors {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        while(n>0){
            int val = divisors(n);
            n--;
            sum+=val;
        }
        return sum;
     }
     static int divisors(int n){
         int sum = 0;
         int sqt = (int) Math.sqrt(n);
         for(int i =1;i<=sqt;++i){
             if(n%i==0){
                 sum+=i;
                 if(i!=n/i){
                     sum+=(n/i);
                    
                 }
             }
         }
         return sum;
     }
     public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));;
     }
}
