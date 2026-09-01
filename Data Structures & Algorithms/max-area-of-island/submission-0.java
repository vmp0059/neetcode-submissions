class Solution {
    public int dfs(int row,int col,int[][] grid){
        if(row<0|| row>=grid.length || col<0 || col>=grid[0].length)return 0;

        if(grid[row][col]==0)return 0;
              grid[row][col] = 0;
        int area=1;
        area += dfs(row + 1, col, grid); // down
        area += dfs(row - 1, col, grid); // up
        area += dfs(row, col + 1, grid); // right
        area += dfs(row, col - 1, grid); // left
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
       int maxArea=0;
       int n=grid.length;
       int m=grid[0].length;

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                int area=dfs(i,j,grid);
                maxArea=Math.max(maxArea,area);
            }
        }
       } 
       return maxArea;
    }
}
