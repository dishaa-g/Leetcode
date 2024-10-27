class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] a= new int[n+1];
        a[0]=0;
        a[1]=1;
        int b,c=0;
        for(int i = 2; i<=n; i++ ){
            b=i-1;
            c=i-2;
            a[i]=a[b]+a[c];
        }
        return a[n];
        
    }
}