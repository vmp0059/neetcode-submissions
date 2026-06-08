class Solution {

    public int help(int idx,int dp[],int arr[]){
        if(idx==0)return arr[idx];

        if(idx<0)return 0;

        if(dp[idx]!=-1)return dp[idx];

        int pick=arr[idx]+help(idx-2,dp,arr);
        int notpick=help(idx-1,dp,arr);

        dp[idx]=Math.max(pick,notpick);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        int arr1[]=new int[n-1];
        int arr2[]=new int[n-1];

        for(int i=0;i<n;i++){
            if(i!=n-1){
                arr1[i]=nums[i];
            }
            if(i!=0){
                arr2[i-1]=nums[i];
            }
        }

        int dp1[]=new int[n];
        Arrays.fill(dp1,-1);
        int ans1=help(arr1.length-1,dp1,arr1);

        int dp2[]=new int[n];
        Arrays.fill(dp2,-1);
        int ans2=help(arr2.length-1,dp2,arr2);

        return Math.max(ans1,ans2);


    }
}
