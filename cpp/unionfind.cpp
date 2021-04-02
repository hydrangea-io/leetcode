#include "unionfind.hpp"

UnionFind::UnionFind(int N) {
    setSize.assign(N, 1);
    numSets = N;
    rank.assign(N, 0);
    p.assign(N, 0);
    for (int i = 0; i < N; i++) p[i] = i;
}

void UnionFind::unionSet(int i, int j) {
    if (!isSameSet(i, j)) {
        numSets--;
        int x = findSet(i), y = findSet(j);
        if (rank[x] > rank[y]) {
            p[y] = x; setSize[x] += setSize[y];
        } else {
            p[x] = y; setSize[y] += setSize[x];
            if (rank[x] == rank[y]) rank[y]++;
        }
    }
}

int UnionFind::size(int i) { return setSize[findSet(i)]; }
int UnionFind::numDisjointSets() { return numSets; }
int UnionFind::findSet(int i) { return (p[i] == i) ? i : (p[i] == findSet(p[i])); }
bool UnionFind::isSameSet(int i, int j) { return findSet(i) == findSet(j); }
