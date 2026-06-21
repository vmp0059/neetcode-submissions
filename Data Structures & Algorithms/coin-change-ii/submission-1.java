class Solution {
    public int help(int tar,int arr[],int idx,int dp[][]){
        if(idx==0){
            return (tar%arr[0]==0) ? 1:0;
        }
        if(dp[idx][tar]!=-1)return dp[idx][tar];
        int nottaken=help(tar,arr,idx-1,dp);
        int taken=0;
        if(arr[idx]<=tar){
            taken=help(tar-arr[idx],arr,idx,dp);
        }

        return dp[idx][tar]=nottaken+taken;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        return help(amount,coins,n-1,dp);
    }
}
