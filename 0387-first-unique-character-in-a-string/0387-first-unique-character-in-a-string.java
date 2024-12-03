import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));       // Output: 0
        System.out.println(solution.firstUniqChar("loveleetcode"));  // Output: 2
        System.out.println(solution.firstUniqChar("aabb"));          // Output: -1
    }
}
