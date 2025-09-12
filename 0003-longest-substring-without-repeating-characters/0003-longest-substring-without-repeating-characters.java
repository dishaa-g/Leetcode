class Solution {
    public int lengthOfLongestSubstring(String s) {
       if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength; 
    }
}