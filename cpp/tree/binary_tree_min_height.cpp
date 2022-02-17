// 二叉树的最小深度

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
    int minDepth(TreeNode* root) {
        if (!root) {
            return 0;
        }
        int left = minDepth(root->left);
        int right = minDepth(root->right);
        return (left == 0 || right == 0) ? left + right + 1 : min(left, right) + 1;
    }

    // 广度优先
    int minDepth1(TreeNode* root) {
        if (!root) {
            return 0;
        }
        
        queue<TreeNode*> que;
        que.push(root);
        int res = 0;
        while(!que.empty()) {
            int size = que.size();
            res++;
            while(size-- > 0) {
                TreeNode* node = que.front();
                que.pop();
                if (!node->left && !node->right) {
                    return res;
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
};
