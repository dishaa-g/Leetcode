class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> neg= new ArrayList<>();
        ArrayList<Integer> pos= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) neg.add(nums[i]);
            else pos.add(nums[i]);
        }

        if(neg.size()==0){
            for(int i=0;i<nums.length; i++){
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }

        if(pos.size()==0){
            int[] res=new int[nums.length];
            int index= nums.length-1;
            for(int i=0;i<nums.length;i++){
                res[index]=nums[i]*nums[i];
                index--;
            }
            return res;
        }

        for(int i=0;i<neg.size();i++){
            neg.set(i, neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
        int p1=0;
        int p2=0;
        int[] res= new int[nums.length];
        int index=0;
        while(p1<neg.size() && p2<pos.size()){
            if(neg.get(p1)<=pos.get(p2)){
                res[index]=neg.get(p1);
                index++;
                p1++;
            } else{
                res[index]=pos.get(p2);
                p2++;
                index++;
            }
        }
        while(p1<neg.size()){
            res[index]=neg.get(p1);
            index++;
            p1++;
        }
        while(p2<pos.size()){
            res[index]=pos.get(p2);
            index++;
            p2++;
        }
        return res;
    }
}