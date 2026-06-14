class Solution {
    public int maxProfit(int[] arr) {
      int n=arr.length;
        int dp[][]=new int[n+2][2];

        for(int idx=n-1;idx>=0;idx--){
            for(int buy=0;buy<2;buy++){
                if(buy==0){
                    dp[idx][buy]=Math.max(0 + dp[idx + 1][0], (-1)*arr[idx] + dp[idx + 1][1]);
                }

                if(buy==1){
                    dp[idx][buy]=Math.max(0 + dp[idx + 1][1], arr[idx] + dp[idx + 2][0]);
                }
            }
        
    }
    return dp[0][0];
      
    }
}
