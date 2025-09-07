class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int index=1;
        int k=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index]=nums[i+1];
                index++;
                k++;
            }
        }
        return k;
    }
}