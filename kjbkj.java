class Solution {
    public boolean isPalindrome(int x) {
        if((x%10==0 && x!=0)  || x < 0){
            return false;
        }
        int temp = x;
        int revNum= 0;
        while(x!=0){
          int digit = x%10;
          x/=10;
          revNum = revNum*10 + digit;
        }
        if(revNum == temp){
            return true;
        }else{
            return false;
        }
    }
}
