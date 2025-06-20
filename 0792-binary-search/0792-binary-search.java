class Solution {
    public int search(int[] nums, int target) {

        int result= func(nums, target, 0, nums.length -1);
        return result;
    }

    static int func(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(nums[m]== target){
            return m;
        }
        if(nums[m]<target){
            return func(nums, target, m+1, e);
        }
        return func(nums,target, s, m-1);
    }
}