class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        int ft=0;
        int st=1,tt=1;
        int a=0;
        for(int i=3; i<=n; i++){
            a= ft+st+tt;
            ft=st;
            st=tt;
            tt=a;
        }
        return a;
        
    }
}