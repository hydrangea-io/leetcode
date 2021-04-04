#include <memory>
#include <iostream>

template <typename T>
struct BinaryTreeNode {
    T data;
    unique_ptr<BinaryTreeNode<T>> left, right;
};

void TreeTraversal(const std::unique_ptr<BinaryTreeNode<int>>& root) {
    if (root) {
        std::cout << "Preorder: " << root->data << std::endl;
    }
    TreeTraversal(root->left);

    std::cout << "Inorder: " << root->data << std::endl;
    TreeTraversal(root->right);

    std::cout << "Postorder: " << root->data << std::endl;
}

// 10.1 Test if a binary tree is height-balanced