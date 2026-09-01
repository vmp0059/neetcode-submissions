class Solution {
    public int findJudge(int n, int[][] trust) {
        int indegree[]=new int[n+1];
        int outdegree[]=new int[n+1];

        for(int t[]:trust){
            int a=t[0];
            int b=t[1];

            outdegree[a]++;
            indegree[b]++;


        }

        for(int p=1;p<=n;p++){
            if(outdegree[p]==0 && indegree[p]==n-1){
                return p;
            }
        }
        return -1;
    }
}