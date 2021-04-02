#include "typedefinition.hpp"

vi dfs_num;
const int VISITED = 1;
const int UNVISITED = 0;
vvii AdjList;

void dfs(int u) {
    // O(V + E) approach using adjacency list
    dfs_num[u] = VISITED;
    for (int j = 0; j < (int)AdjList[u].size(); j++) {
        ii v = AdjList[u][j];
        if (dfs_num[v.first] == UNVISITED)
            dfs(v.first);
    }
}
