//
// Created by roseduan on 2021/9/20.
// 二叉树的前序遍历

#include "vector"
#include "stack"

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
    // 二叉树的前序遍历 递归
    vector<int> preorderTraversal1(TreeNode* root) {
        vector<int> res;
        orderHelper(root, res);
        return res;
    }

    // 迭代
    vector<int> preorderTraversal2(TreeNode* root) {
        if (!root) {
            return {};
        }
        vector<int> res;
        stack<TreeNode*> s;
        s.push(root);
        while (!s.empty()) {
            auto node = s.top();
            s.pop();
            res.push_back(node->val);
            if (node->right) {
                s.push(node->right);
            }
            if (node->left) {
                s.push(node->left);
            }
        }
        return res;
    }

private:
    void orderHelper(TreeNode* root, vector<int> &res) {
        if (root == nullptr) {
            return;
        }
        res.push_back(root->val);
        orderHelper(root->left, res);
        orderHelper(root->right, res);
    }
};
