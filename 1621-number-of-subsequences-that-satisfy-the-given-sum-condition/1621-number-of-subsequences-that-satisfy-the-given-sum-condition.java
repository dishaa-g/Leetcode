import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n - 1;
        int res = 0;
        int mod = (int) 1e9 + 7;
        
        // Precompute the powers of 2 modulo mod
        int[] power = new int[n + 1];
        power[0] = 1;
        for (int i = 1; i <= n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                res = (res + power[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
