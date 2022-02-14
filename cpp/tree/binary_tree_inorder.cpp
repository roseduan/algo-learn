// 二叉树的中序遍历

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
    // 递归
    vector<int> inorderTraversal1(TreeNode* root) {
        vector<int> res;
        helper(root, res);
        return res;
    }
    void helper(TreeNode* root, vector<int>& res) {
        if (!root) {
            return;
        }
        helper(root->left, res);
        res.push_back(root->val);
        helper(root->right, res);
    }

    // 迭代
    vector<int> inorderTraversal2(TreeNode* root) {
        stack<TreeNode*> s;
        TreeNode* cur = root;
        vector<int> res;
        while(!s.empty() || cur) {
            while (cur) {
                s.push(cur);
                cur = cur->left;
            }
            TreeNode* node = s.top();
            s.pop();
            res.push_back(node->val);
            cur = node->right;
        }
        return res;
    }
};
