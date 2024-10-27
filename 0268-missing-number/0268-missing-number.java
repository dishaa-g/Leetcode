class Solution {
    public int missingNumber(int[] nums) {
        int r=nums.length;
        int c= (r*(r+1))/2;
        int a=0;
        for(int i=0;i<r;i++){
            a=a+nums[i];
        }
        int b= c-a;
        return b;
        
    }
}