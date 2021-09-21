//
// Created by roseduan on 2021/9/20.
//
#include "stack"
#include "queue"
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode() {}
    TreeNode(int val) : val(val) {}
    TreeNode(int val, TreeNode *left, TreeNode *right) : val(val), left(left), right(right) {}
};

class Solution {
public:
    // 翻转二叉树 递归
    TreeNode* invertTree(TreeNode* root) {
        if (!root) {
            return root;
        }
        auto right = root->right;
        root->right = root->left;
        root->left = right;
        invertTree(root->left);
        invertTree(root->right);
        return root;
    }
    
    // 翻转二叉树 迭代广度优先
    TreeNode* invertTree2(TreeNode* root) {
        if (!root) {
            return root;
        }

        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            TreeNode* node = q.front();
            q.pop();
            TreeNode *left = node->left;
            node->left = node->right;
            node->right = left;
            if (node->left) {
                q.push(node->left);
            }
            if (node->right) {
                q.push(node->right);
            }
        }
        return root;
    }
};
