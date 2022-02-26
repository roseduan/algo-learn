// 二叉树展开为链表

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
    void flatten(TreeNode* root) {
    }
};
