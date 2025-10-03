class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        int max=0;
        HashMap<Character,Integer> map= new HashMap<>();
        int l=0;
        for(int r=0; r<s.length(); r++){
            char curr= s.charAt(r);
            if(map.containsKey(curr)){
                l= Math.max(l,map.get(curr)+1);
            }
            map.put(curr, r);
            max= Math.max(max, r-l+1);
        }
        return max;
    }
}