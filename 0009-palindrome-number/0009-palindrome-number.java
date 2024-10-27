class Solution {
    public boolean isPalindrome(int x) {
        int b=x;
        int rev=0,a=0;
        while(x>0){
            a=x%10;
            rev=rev*10+a;
            x=x/10;
        }
        if(rev==b){
            return true;
        }
        else{
            return false;
        }
    }
}