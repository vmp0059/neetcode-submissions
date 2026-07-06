class Solution {
     public int help(int idx,int prev,int arr[],int n,int dp[][]){
        if(idx==n)return 0;
        if(dp[idx][prev+1]!=-1)return dp[idx][prev+1];
        int notTake=help(idx+1,prev,arr,n,dp);
        int take=0;
        if(prev==-1 || arr[idx]>arr[prev]){
             take=help(idx+1,idx,arr,n,dp)+1;
        }
        return dp[idx][prev+1]=Math.max(take,notTake);
    }
    public int lengthOfLIS(int[] nums) {
        
        int n=nums.length;
         int dp[][]=new int[n][n+1];
         for(int row[]:dp){
            Arrays.fill(row,-1);
         }
        return help(0,-1,nums,n,dp);
    }
}
