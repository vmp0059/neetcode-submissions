class Solution {
    public int lengthOfLIS(int[] nums) {
          int n=nums.length;
        // int dp[][]=new int[n+1][n+1];
        int next[]=new int[n+1];
        int curr[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            for(int prev=i-1;prev>=-1;prev--){
                int notTake=next[prev+1];
                int take=0;
                if(prev==-1 || nums[i]>nums[prev]){
                    take=next[i+1]+1;
                }

                curr[prev+1]=Math.max(take,notTake);
            }
            next = curr.clone();
        }
        return next[0];
    }
}
