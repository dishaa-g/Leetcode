import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]));
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.add(new int[] {i, 0});
        }

        while (k > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            result.add(Arrays.asList(nums1[current[0]], nums2[current[1]]));
            if (current[1] + 1 < nums2.length) {
                minHeap.add(new int[] {current[0], current[1] + 1});
            }
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k1 = 3;
        System.out.println(solution.kSmallestPairs(nums1, nums2, k1));
        
        int[] nums3 = {1, 1, 2};
        int[] nums4 = {1, 2, 3};
        int k2 = 2;
        System.out.println(solution.kSmallestPairs(nums3, nums4, k2));
    }
}
