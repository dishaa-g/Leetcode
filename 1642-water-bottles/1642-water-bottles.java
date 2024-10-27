class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a= numBottles;
        while(numBottles>=numExchange){
            int changed= numBottles/numExchange;
            int rem = numBottles%numExchange;
            a=a+changed;
            numBottles=changed+rem;
        }
        return a;
        
    }
}