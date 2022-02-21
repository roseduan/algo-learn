// 二叉树的层序遍历ii

#include "vector"
#include "queue"
#include "algorithm"

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
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int>> res;
        helper(root, res, 0);
        reverse(res.begin(), res.end());
        return res;
    }

    void helper(TreeNode* root, vector<vector<int>>& res, int level) {
        if (!root) {
            return;
        }
        if (res.size() < level + 1) {
            res.push_back(vector<int>{});
        }
        res[level].push_back(root->val);
        helper(root->left, res, level + 1);
        helper(root->right, res, level + 1);
    }

    // 广度优先
    vector<vector<int>> levelOrderBottom1(TreeNode* root) {
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
        reverse(res.begin(), res.end());
        return res;
    }
};
