public class pattern{


/*  Pattern 1
    *  *  *  *  * 
    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j = 0;j<5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    } */
  

   
/*   Pattern 2
     *
     *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *
    public static void main(String[] args) {
        for (int i = 0; i <=4; i++) {
            for(int j = 0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    } */ 
          
     

/*   Pattern 3
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
   
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {
            for(int j = 1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }  */
     

/*  Pattern 4
    1 
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for(int j = 1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    } */

/*  Pattern 5
    * * * * * 
    * * * *
    * * *
    * *
    *
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for(int j = 5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    } */

/* Pattern 6
    1 2 3 4 5 
    1 2 3 4
    1 2 3
    1 2
    1
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++) {
            for(int j = 1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } */

   /* Pattern 7
                   *
                *  *  *
             *  *  *  *  *
          *  *  *  *  *  *  *
       *  *  *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *  *  *  * 
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++) {
            for(int j=0;j<5-i+1;j++){
                System.out.print("   ");
            }
            for(int j=0;j<(2*i)+1;j++){
                System.out.print(" * ");
            }
            for(int j=0;j<5-i+1;j++){
                System.out.print("   ");
            }
            System.out.println();
            }
           
        }*/

   /* 

      Pattern 8                                       
    *  *  *  *  *  *  *  *  *  *  * 
       *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *
            *  *  *  *  *
               *  *  *
                  *
                             
        public static void main(String[] args) {
            for (int i = 0; i<=5; i++) {
                for(int j=0;j<i;j++){
                    System.out.print("   ");
                }
                for(int j=0;j<2*5-(2*i)+1;j++){
                    System.out.print(" * ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("   ");
                }
                System.out.println();
                }
               
            } */
    
           
       /* Pattern 10
            * 
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *
            *  *  *  *
            *  *  *
            *  *
            *
            public static void main(String[] args) {
                int n=5;
                for (int i = 1; i<=(2*n)-1; i++) {
                    int starts = i;
                    if(i>n) starts = (2*n)-i;
                    for(int j = 1;j<=starts;j++){
                       System.out.print(" * ");
                    }
                 System.out.println();
                   
                } 
            } */ 
        /*Pattern 11 
             1
             01
             101
             0101
             10101
            public static void main(String[] args) {
                int n=5;
                int start =1;
                for(int i=0;i<n;i++){
                if(i%2==0) start = 1;
                else start=0;
                for(int j=0;j<=i;j++){
                   System.out.print(start);
                   start = 1-start;
                }
                System.out.println();
                }

            }            */
         /*Patttern 12 
            1        1
            12      21
            123    321
            1234  4321
            1234554321
        public static void main(String[] args) {
        int n=5;
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            // Number
           for(int j = 1;j<=i;j++){
            System.out.print(j);
           }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

             // Number
             for(int j = i;j>=1;j--){
                System.out.print(j);
               }
               System.out.println();
               space-=2;
        } 
    } */



    /* Pattern 13        
       1 
       2 3
       4 5 6
       7 8 9 10
       11 12 13 14 15
    
    public static void main(String[] args) {
        int n=5;
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    } */


    /*Pattern 14 
     *A
    A B
      A B C
      A B C D
      A B C D E
   
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
            for(char ch = 'A';ch<'A'+i; ch++){
                System.out.print(ch+" ");
               
            }
            System.out.println();
        }
    }  */


    /* Pattern 20   
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** ***** 
      public static void main(String[] args) {
        int n =5;
        int inSt= 0;    
        for(int i=0;i<=n-1;i++){
            // Star
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j =0;j<=inSt;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            inSt+=2;
        }
        int inSte= 2*n-2;    
        for(int i=1;i<=n;i++){
            // Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =0;j<=inSte;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           
            inSte-=2;
            System.out.println();
        }
      } */

    /*Pattern  20  
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        * 
      public static void main(String[] args) {
        int n =5;
        int space = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars =i;
            if(i>n) stars = 2*n-i;
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j =1;j<=space;j++ ){
                System.out.print(" ");
            }
             for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2;
            else space+=2;
        }
      }*/
        /*  Pattern 21
****
*  *
*  *
**** 

      public static void main(String[] args) {
        int n=4;
        for(int i =0;i<n;i++){
          for(int j=0;j<n;j++){
            if(i==0||i==n-1||j==0||j==n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
          }
          System.out.println();
        }
      }*/ 

      public static void main(String[] args) {
        int n = 4;
        for(int i = 0;i<2*n-1;i++){
            for(int j = 0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right =(2*n-2)-j;
                int down = (2*n-2)-i;
               System.out.print((n-Math.min(Math.min(top,down),Math.min(left,right))));
               
            }
            System.out.println();
        }
      }

 

   
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
