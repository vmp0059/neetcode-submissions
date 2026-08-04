class Solution {
    int[] delRow={-1,0,1,0};
    int[] delCol={0,-1,0,1};

    public void dfs(int r,int c,boolean vis [][],char[][] board,int n,int m){
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nrow=r+delRow[i];
            int ncol=c+delCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && !vis[nrow][ncol]){
                dfs(nrow, ncol, vis, board, n, m);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];

        for(int j=0;j<m;j++){
            if(!vis[0][j] && board[0][j]=='O'){
                dfs(0,j,vis,board,n,m);
            }

            if(!vis[n-1][j] && board[n-1][j]=='O'){
                dfs(n-1,j,vis,board,n,m);
            }
        }

        for(int i=0;i<n;i++){
            if(!vis[i][0] && board[i][0]=='O'){
                dfs(i,0,vis,board,n,m);
            }

            if(!vis[i][m-1] && board[i][m-1]=='O'){
                dfs(i,m-1,vis,board,n,m);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
      

       
    }
}
