import java.lang.Math;

class Solution {
    public int maxProduct(int[] nums) {
        int a=0;
        int maximum=0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                int b= (nums[i]-1)*(nums[j]-1);
                maximum= Math.max(a,b);
                a= maximum;
            }
        }
        return maximum;
    }
}