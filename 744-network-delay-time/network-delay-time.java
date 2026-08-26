class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: times){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[] {v, w});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] dist = new int[n + 1];
        Arrays.fill(dist, (int) 1e9);
        dist[k] = 0;
        pq.offer(new int[]{0, k});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int dis = curr[0];
            int node = curr[1];
            if(dis > dist[node]) continue;
            for(int[] it: adj.get(node)){
                int adjNode = it[0];
                int wt = it[1];
                if(dis + wt < dist[adjNode]){
                    dist[adjNode] = dis + wt;
                    pq.offer(new int[]{dist[adjNode], adjNode});
                }
            }
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(dist[i] == (int)1e9) return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}