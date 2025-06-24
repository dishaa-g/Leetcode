class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }

        boolean equal= true;
        for(int i =1; i<n; i++){
            if(nums[i]!=nums[0]){
                equal=false;
                break;
            }
        }
        return count==1 || equal ;
    }
}