class Solution {
    public boolean isValid(int capacity,int[] weights,int days){
        int daysneeded=1;
        int currweight=0;
        for(int weight:weights){
            if(currweight+weight>capacity){
                daysneeded++;
                currweight = 0;
            }
            currweight += weight;

        }
        return daysneeded<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while(low<=high){
             int mid = low + (high - low) / 2;
            int ans=0;
             if (isValid(mid,weights, days)){
                ans=mid;
                high=mid-1;
             }else{
                low=mid+1;
             }
        }
        return low;
    }
}