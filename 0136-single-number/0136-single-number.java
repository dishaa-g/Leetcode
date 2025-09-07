class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int candidate=0;
        int result=0;
        int count=0;
        for(int i=0;i<n;i++){
            candidate=nums[i];
            for(int j=0;j<n;j++){
                if(nums[j]==candidate){
                    count++;
                }
                if(count==2){
                    count=0;
                    break;
                }
            }
            if(count==1) result=candidate;
        }
        return result;
    }
}