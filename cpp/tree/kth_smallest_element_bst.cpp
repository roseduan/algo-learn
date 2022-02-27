// 二叉搜索树中第k小的元素

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

    // 中序遍历，取第k个
    int kthSmallest1(TreeNode* root, int k) {
        vector<int> vals;
        helper(root, vals);
        return vals[k - 1];
    }

    void helper(TreeNode* root, vector<int>& vals) {
        if (!root) {
            return;
        }
        helper(root->left, vals);
        vals.push_back(root->val);
        helper(root->right, vals);
    }

    // 中序遍历优化，取到第k个时结束
    int kthSmallest2(TreeNode* root, int k) {
        stack<TreeNode*> s;
        TreeNode* cur = root;
        while (!s.empty() || cur) {
            while (cur) {
                s.push(cur);
                cur = cur->left;
            }
            TreeNode* node = s.top();
            s.pop();
            if (--k == 0) {
                return node->val;
            }
            cur = node->right;
        }
        return 0;
    }
};
