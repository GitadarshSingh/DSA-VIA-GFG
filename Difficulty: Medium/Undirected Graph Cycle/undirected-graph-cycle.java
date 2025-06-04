class Solution {
    public boolean isCycle(int V, int[][] edges) {
        int[] parent = new int[V];
        // Initially, all vertices are their own parent
        for (int i = 0; i < V; i++) parent[i] = i;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            int parentU = find(parent, u);
            int parentV = find(parent, v);

            // If u and v have same parent, cycle is detected
            if (parentU == parentV) return true;

            // Union the sets
            parent[parentU] = parentV;
        }

        return false;
    }

    // Find function with path compression
    private int find(int[] parent, int node) {
        if (parent[node] != node)
            parent[node] = find(parent, parent[node]);
        return parent[node];
    }
}
