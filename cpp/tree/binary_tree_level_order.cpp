// 二叉树的层序遍历

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
    
    // 广度优先遍历
    vector<vector<int>> levelOrder1(TreeNode* root) {
        vector<vector<int>> res;
        if (!root) {
            return res;
        }

        queue<TreeNode*> que;
        que.push(root);
        while (!que.empty()) {
            int size = que.size();
            vector<int> vals;
            while (size-- > 0) {
                TreeNode* node = que.front();
                que.pop();
                vals.push_back(node->val);
                if (node->left) {
                    que.push(node->left);
                }
                if (node->right) {
                    que.push(node->right);
                }
            }
            res.push_back(vals);
        }
        return res;
    }

    // 深度优先
    vector<vector<int>> levelOrder2(TreeNode* root) {
        vector<vector<int>> res;
        helper(root, res, 1);
        return res;
    }

    void helper(TreeNode* root, vector<vector<int>> &res, int level) {
        if (!root) {
            return;
        }
        if (res.size() < level) {
            res.push_back(vector<int>{});
        }
        res[level-1].push_back(root->val);
        helper(root->left, res, level+1);
        helper(root->right, res, level+1);
    }
};
