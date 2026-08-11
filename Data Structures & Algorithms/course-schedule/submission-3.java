class Solution {
    public int[] topoSort(ArrayList<Integer>adj[],int N){
    int[] indegree=new int[N];
    for(int i=0;i<N;i++){
        for(int it:adj[i]){
            indegree[it]++;
        }
    }

        int ans[]=new int[N];
        int idx=0;

         Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < N; i++) {
	        if(indegree[i] == 0) q.add(i);
	    }

         while(!q.isEmpty()){
            int node=q.poll();
            ans[idx++]=node;

            for(int it:adj[node]){
                indegree[it]--;

                 if(indegree[it] == 0) q.add(it);
            }

            
         }
        if(idx < N)
    return new int[0];
         return ans;
    }
    public boolean canFinish(int N, int[][] pre){
        ArrayList<Integer>adj[]=new ArrayList[N];
        for(int i=0;i<N;i++){
            adj[i]=new ArrayList<>();
        }

        for(int p[]:pre){
            int u=p[0];
            int v=p[1];

            adj[v].add(u);
        }

        int topo[]=topoSort(adj,N);

        if(topo.length<N)return false;
        return true;
    }
}
