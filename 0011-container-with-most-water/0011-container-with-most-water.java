class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        while (left < right) {
            int width=right-left;
            int water = Math.min(height[left], height[right]) * (width);
            res = Math.max(res, water);
            
            if (height[left] < height[right]) left++;
            else right--;
        }
        
        return res;
    }
}