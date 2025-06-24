class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        int a1=0,b1=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                a[a1]=nums[i];
                a1++;
            }
            else{
                b[b1]=nums[i];
                b1++;
            }
        }
        a1=0;
        b1=0;
        for(int i=0;i<n;i++){
            if(i%2 ==0){
                nums[i]=a[a1];
                a1++;
            }
            else{
                nums[i]=b[b1];
                b1++;
            }
        }
        return nums;
    }
}