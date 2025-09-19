class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        HashSet<Integer> ans= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        int longseq=1;
        for(int num:ans){
            if(ans.contains(num-1)) continue;
            else{
                int curr=num;
                int currseq=1;
                while(ans.contains(curr+1)){
                    curr++;
                    currseq+=1;
                }
                longseq= Math.max(longseq,currseq);
            }
        }
        return longseq;
    }
}