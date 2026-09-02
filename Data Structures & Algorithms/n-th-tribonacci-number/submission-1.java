class Solution {
    public int solve(int idx,int dp[]){
        if(idx==0)return 0;
        if(idx==1)return 1;
        if(idx==2)return 1;
        if(dp[idx]!=-1)return dp[idx];

        dp[idx]=solve(idx-1,dp)+solve(idx-2,dp)+solve(idx-3,dp);
        return dp[idx];

    }
    public int tribonacci(int idx) {
        int dp[]=new int[idx+1];
        Arrays.fill(dp,-1);
        return solve(idx,dp);
    }
}