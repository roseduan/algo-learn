// 二叉树的右视图

#include "vector"
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

    // 广度优先搜索
    vector<int> rightSideView1(TreeNode* root) {
        vector<int> res;
        if (!root) {
            return res;
        }

        queue<TreeNode*> que;
        que.push(root);
        while (!que.empty()) {
            int size = que.size();
            while (size-- > 0) {
                TreeNode* node = que.front();
                que.pop();
                if (size == 0) {
                    res.push_back(node->val);
                }
                if (node->left) {
                    que.push(node->left);
                }
                if (node->right) {
                    que.push(node->right);
                }
            }
        }
        return res;
    }

    // 深度优先
    vector<int> rightSideView2(TreeNode* root) {
        vector<int> res;
        helper(root, res, 0);
        return res;
    }

    void helper(TreeNode* root, vector<int> &res, int level) {
        if (!root) {
            return;
        }
        if (level == res.size()) {
            res.push_back(root->val);
        }
        helper(root->right, res, level+1);
        helper(root->left, res, level+1);
    }
};
