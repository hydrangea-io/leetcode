package leetcode.algorithm;

import java.util.Queue;
import java.util.LinkedList;

public class GraphSearch {

    public void bfs(int[][] adj, int n, int s) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] used = new boolean[n];
        int[] d = new int[n];
        int[] p = new int[n];

        q.add(s);
        used[s] = true;
        p[s] = -1;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int u : adj[v]) {
                if (!used[v]) {
                    used[u] = true;
                    q.add(u);
                    d[u] = d[v] + 1;
                    p[u] = v;
                }
            }
        }
    }
}