#include "typedefinition.hpp"

class UnionFind {
private:
    /**
     * p: p[i] stores the immediate parent of item i.
     * rank: rank[i] yields (the upper bound of) the height of the tree rooted at item i.
     */
    vi p, rank, setSize;
    int numSets;
public:
    UnionFind(int N);

    void unionSet(int i, int j);
    int size(int i);
    int numDisjointSets();
    int findSet(int i);
    bool isSameSet(int i, int j);
};
