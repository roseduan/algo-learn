// 路径总和

#include "iostream"
#include "vector"
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

    // 深度优先
    bool hasPathSum(TreeNode* root, int targetSum) {
        if (!root) {
            return false;
        }
        if (!root->left && !root->right) {
            return targetSum == root->val;
        }
        int sub = targetSum - root->val;
        return hasPathSum(root->left, sub) || hasPathSum(root->right, sub);
    }

    // 广度优先
    bool hasPathSum2(TreeNode* root, int targetSum) {
        if (!root) {
            return false;
        }

        queue<TreeNode*> que;
        que.push(root);
        queue<int> vals;
        vals.push(root->val);

        while (!que.empty()) {
            auto node = que.front();
            que.pop();
            int i = vals.front();
            vals.pop();

            if (!node->left && !node->right) {
                if (targetSum == i) {
                    return true;
                }
            }
            if (node->left) {
                que.push(node->left);
                vals.push(node->left->val + i);
            }
            if (node->right) {
                que.push(node->right);
                vals.push(node->right->val + i);
            }
        }
        return false;
    }
};
