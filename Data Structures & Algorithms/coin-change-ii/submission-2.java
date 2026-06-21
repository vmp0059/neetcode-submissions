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
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)dp[0][i]=1;
        }

        for(int idx=1;idx<n;idx++){
            for(int tar=0;tar<=amount;tar++){
                int nottaken=dp[idx-1][tar];

                int taken=0;
                if(coins[idx]<=tar){
                    taken=dp[idx][tar-coins[idx]];
                }
                dp[idx][tar]=nottaken+taken;
            }
        }

        return dp[n-1][amount];
    }
}
