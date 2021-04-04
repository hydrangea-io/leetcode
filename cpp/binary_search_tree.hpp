#include <queue>
#include <stack>

#ifndef BINARY_SEARCH_TREE
#define BINARY_SEARCH_TREE

template<class T>
class Stack : public stack<T> { ... }

template<class T>
class Queue : public queue<T> {
public:
    T dequeue() {
        T tmp = front();
        queue<T>::pop();
        return tmp;
    }
    void enqueue(const T& e1) {
        push(e1);
    }
};

template<class T>
class BSTNode {
private:
    T e1;
    BstNode<T> *left, *right;
public:
    BSTNode() {
        left = right = 0;
    }
    BSTNode(const T& e, )
};

#endif