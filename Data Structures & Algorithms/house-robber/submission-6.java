class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(dp,nums,n-1);
        
    }
    public int solve(int dp[],int nums[],int n){
        if(n==0)return nums[0];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int pick=solve(dp,nums,n-2)+nums[n];
        int npick=solve(dp,nums,n-1);

        return dp[n]=Math.max(pick,npick);
    }
}
