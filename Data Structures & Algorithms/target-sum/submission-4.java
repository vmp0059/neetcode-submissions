class Solution {
    public int help(int nums[],int tar){
        int n = nums.length;
        int prev[]=new int[tar+1];

        if(nums[0]==0){
            prev[0]=2;
        }else{
            prev[0]=1;
        }

        if(nums[0]!=0 && nums[0]<=tar){
            prev[nums[0]]=1;
        }

        for(int idx=1;idx<n;idx++){
            int curr[]=new int[tar+1];
            for(int t=0;t<=tar;t++){
                int notpick=prev[t];

                int pick=0;
                if(nums[idx]<=t){
                    pick=prev[t-nums[idx]];
                }
                curr[t]=pick+notpick;
            }
            prev=curr;
        }
        return prev[tar];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int totSum=0;
        for(int i=0;i<n;i++){
            totSum+=nums[i];
        }

        if(totSum-target<0 || (totSum-target)%2!=0)return 0;
        int k=(totSum-target)/2;
        return help(nums,k);
    }
}
