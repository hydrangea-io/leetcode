#include "unionfind.hpp"

/**
 * LeetCode 684. Redundant Connection.
 * In this problem, a tree is an undirected graph that is connected
 * and has no cycles.
 *
 * The given input is a graph that started as a tree with N nodes (with
 * distinct values 1, 2, ..., N), with one additional edge added.
 *
 * Return an edge that can be removed so that the resulting graph
 * is a tree of N nodes. If there are multiple answers, return the answer
 * that occurs last in the given 2d-array.
 */
class RedundantConnection {
public:
    vi findRedundantConnection(vvi& edges) {
        if (edges.size() == 0 || edges[0].size() == 0) {
            return vi { 0, 0 };
        }
        return vi { 0, 0 };
    }
};