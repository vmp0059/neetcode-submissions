class Solution {
    
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }

    public int solve(int idx,int[]dp){
        if(idx==0)return 1;
        if(idx==1)return 1;
        if(dp[idx]!=-1)return dp[idx];

        int left=solve(idx-1,dp);
        int right=solve(idx-2,dp);

        return dp[idx]=left+right;
    }
}
