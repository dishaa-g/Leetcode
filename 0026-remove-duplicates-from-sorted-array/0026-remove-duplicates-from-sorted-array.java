class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int k=1;
        int index=1;
        int candidate= nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]!= candidate){
                candidate=nums[i];
                nums[index++]= nums[i];
                k++;
            }
        }
        return k;
    }
}