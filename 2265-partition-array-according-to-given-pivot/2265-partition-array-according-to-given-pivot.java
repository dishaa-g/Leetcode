class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans= new int[nums.length];
        int l=0;
        int r=nums.length -1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                ans[l++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[r--]=nums[j];
            }
        }
        while(l<=r){
            ans[l++]=pivot;
        }
        return ans;
    }
}