// 二叉树的最近公共祖先

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

    // 如果 root 为空，或者 p q 任意一个等于 root，则直接返回
    // 递归遍历左右
    // 如果左右均不为空，则说明root就是最近公共祖先
    // 否则哪个不为空就返回哪个
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        if (!root || root == p || root == q) {
            return root;
        }
        TreeNode* left = lowestCommonAncestor(root->left, p, q);
        TreeNode* right = lowestCommonAncestor(root->right, p, q);
        if (left && right) {
            return root;
        }
        return left == nullptr ? right : left;
    }
};
