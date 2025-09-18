class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int n=nums.length;
       int i=0;
       int j=1;
       int[] result= new int[n];
       for(int k=0;k<n;k++){
        if(nums[k]%2==0){
            result[i]=nums[k];
            i+=2;
        }else{
            result[j]=nums[k];
            j+=2;
        }
       }
       return result;
    }
}