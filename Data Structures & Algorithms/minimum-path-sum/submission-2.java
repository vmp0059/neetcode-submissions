class Solution {
    public int help(int i,int j,int grid[][],int dp[][]){
        if(i==0 && j==0)return grid[i][j];
        if(i<0 || j<0)return (int)1e9;
        if(dp[i][j]!=-1)return dp[i][j];

       
        int up=grid[i][j]+help(i-1,j,grid,dp);
        int left=grid[i][j]+help(i,j-1,grid,dp);

        return dp[i][j] = Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        // int dp[][]=new int[n][m];
        int prev[]=new int[m];
        for(int i=0;i<n;i++){
            int curr[]=new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0)curr[j]=grid[i][j];
                else if(i<0 || j<0)curr[j]=(int)1e9;
                else{
                    int up=(int)1e9;
                    int left=(int)1e9;
                    if(i>0)up=grid[i][j]+prev[j];
                    if(j>0)left=grid[i][j]+curr[j-1];
                    curr[j]=Math.min(up,left);
                }
            }
            prev=curr;
        }
        return prev[m-1];
    }
}