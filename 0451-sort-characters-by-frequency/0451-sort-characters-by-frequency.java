class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder result= new StringBuilder();
        for(int f=s.length();f>0;f--){
            for(int i=0;i<256;i++){
                if(freq[i]==f){
                    for(int j=0;j<f;j++) result.append((char)i);
                    
                }
            }
        }
        return result.toString();
    }
}