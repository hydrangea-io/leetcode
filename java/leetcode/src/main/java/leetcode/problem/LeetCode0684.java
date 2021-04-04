package leetcode.problem;

/**
 * A tree is an undirected graph that is connected and has
 * no cycles.
 * 
 * The given input is a graph that started as a tree with N
 * nodes (with distinct values 1, 2, ..., N), with one additional
 * edge added. The added edge has two different vertices chosen
 * from 1 to N, and was not an edge that aleady existed.
 * 
 * The resulting graph is given as a 2D-array of edges. Each
 * element of edges is a pair [u, v] with u < v, that represents
 * an undirected edge connecting nodes u and v.
 * 
 * Return an edge that can be removed so that the resulting graph
 * is a tree of N nodes. If there are multiple answers, return
 * the answer that occurs last in the given 2D-array.
 */

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.lang.AssertionError;

public class LeetCode0684 {

    /**
     * Approach #1. DFS
     * 
     * For each edge (u, v), traverse the graph with a depth-frist search
     * to see if we can connect u to v. If we can, then it must be the
     * duplicate edge.
     * 
     */ 
    Set<Integer> seen = new HashSet<>();
    int MAX_EDGE_VAL = 1000;

    public int[] findRedundantConnection(int[][] edges) {
        List<Integer>[] graph = new ArrayList[MAX_EDGE_VAL];
        for (int i = 0; i <= MAX_EDGE_VAL; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            seen.clear();
            if (!graph[edge[0]].isEmpty() && 
                !graph[edge[1]].isEmpty() &&
                dfs(graph, edge[0], edge[1]))
            {
                return edge;
            }
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        throw new AssertionError();
    }

    private boolean dfs(List<Integer>[] graph, int source, int target) {
        if (!seen.contains(source)) {
            seen.add(source);
            if (source == target) return true;
            for (int neighbor : graph[source]) {
                if (dfs(graph, neighbor, target)) return true;
            }
        }
        return false;
    }
}