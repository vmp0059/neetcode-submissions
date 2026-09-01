class Solution {
    public void dfs(int row,int col,char[][] grid,int vis[][]){
        
             if(row < 0 || row >= grid.length ||
           col < 0 || col >= grid[0].length) {
            return;
        }

        if(grid[row][col]=='0' || vis[row][col]==1){
            return ;
        }
        vis[row][col]=1;
        dfs(row+1,col,grid,vis);
         dfs(row-1,col,grid,vis);
          dfs(row,col+1,grid,vis);
           dfs(row,col-1,grid,vis);

    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    cnt++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return cnt;
    }
}
