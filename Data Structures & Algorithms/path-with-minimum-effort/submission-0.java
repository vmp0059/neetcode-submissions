class Solution {
      int[] delRow = {-1, 0, 1, 0};
    int[] delCol = {0, -1, 0, 1};

     boolean isValid(int row, int col, int n, int m) {
        
        if (row < 0 || row >= n) return false;
        if (col < 0 || col >= m) return false;

        
        return true;
    }
    public int minimumEffortPath(int[][] heights) {
          int n = heights.length;
        int m = heights[0].length;

        int[][] maxDiff = new int[n][m];
        for (int[] row : maxDiff)
            Arrays.fill(row, Integer.MAX_VALUE);

PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        maxDiff[0][0] = 0;
         pq.add(new int[]{0, 0, 0});

        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int diff=curr[0];;
            int row=curr[1];
            int col=curr[2];

            if (row == n - 1 && col == m - 1)
                return diff;

            for(int i=0;i<4;i++){
                 int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if (isValid(newRow, newCol, n, m)) {
                
                int currDiff=Math.abs(heights[newRow][newCol]-heights[row][col]);

                if (Math.max(currDiff, diff) < maxDiff[newRow][newCol])      { 

                      maxDiff[newRow][newCol] = Math.max(currDiff, diff);
                       
            
              pq.add(new int[]{Math.max(currDiff, diff), newRow, newCol});
                }
        }
            }

    }
    return -1;
    }
}