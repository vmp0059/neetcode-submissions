class Solution {
    public boolean isValid(int minbanana,int[] piles,int n,int h){
        int totalhrs=0;
        for(int i=0;i<piles.length;i++){
            totalhrs+=Math.ceil((piles[i]+minbanana-1)/minbanana);
        }
        return totalhrs<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(mid,piles,n,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return ans;
    }
}
