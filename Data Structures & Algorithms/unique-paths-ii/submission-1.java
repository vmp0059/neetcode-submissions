class Solution {
    public int help(int i,int j,int grid[][],int dp[][]){
        if(i>=0 && j>=0 && grid[i][j]==1)return 0;
        if(i==0 && j==0)return 1;
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int up=help(i-1,j,grid,dp);
        int down=help(i,j-1,grid,dp);

        return dp[i][j]=up+down;
    }
    public int uniquePathsWithObstacles(int[][] Grid) {
        int n=Grid.length;
        int m=Grid[0].length;
        int dp[][]=new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        return help(n-1,m-1,Grid,dp);
    }
}