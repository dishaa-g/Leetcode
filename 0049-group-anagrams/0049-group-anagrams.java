class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> result= new HashMap<>();
        for(String s:strs){
            int[] count= new int[26];
            Arrays.fill(count,0);
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int counts: count){
                sb.append("#");
                sb.append(counts);
            }
            String key=sb.toString();
            if(!result.containsKey(key)){
                result.put(key, new ArrayList());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }
}