package Basic_Recursion;

public class Print1ToN {
    public static void printNos(int n) {
            
           if(n<=0){
               return;
           }
           printNos(n-1);
           System.out.print(n +" ");
        }
      public static void main(String[] args) {
        printNos(10); 
}
}