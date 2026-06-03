class Solution {
    public int helper(int idx,int dp[]){
        if(idx==0 || idx==1) return 1;
        if(dp[idx]!=-1)return dp[idx];
        int left=helper(idx-1,dp);
        int right=helper(idx-2,dp);
        dp[idx] = left + right;
        return dp[idx];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}
