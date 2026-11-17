class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        dfs(graph, 0, graph.length - 1, currPath, result);
        return result;
    }

    private void dfs(int[][] graph, int node, int target, List<Integer> currPath, List<List<Integer>> result){
        currPath.add(node);
        if(node == target){
            result.add(new ArrayList<>(currPath));
        }
        else{
            for(int n: graph[node]){
                dfs(graph, n, target, currPath, result);
            }
        }
        currPath.remove(currPath.size() - 1);
    }
}