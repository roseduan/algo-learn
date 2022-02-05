// 验证二叉搜索树
#include "vector"
#include "stdio.h"
#include "algorithm"
#include "set"

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {

private:
    TreeNode *prev;

public:

    // 递归的方式
    bool isValidBST(TreeNode* root) {

    }

    // 中序遍历的方式，先遍历一遍，将数据存储在数组中，再排序进行比较
    bool isValidBST1(TreeNode* root) {
        std::set<int> set;
        std::vector<int> data;
        helper(root, set, data);

        std::vector<int> temp;
        for (int i : set) {
            temp.push_back(i);
        }
        std::sort(temp.begin(), temp.end());
        return temp == data;
    }

    void helper(TreeNode *root, std::set<int>& set, std::vector<int>& data) {
        if (root == nullptr) {
            return;
        }
        helper(root->left, set, data);
        set.insert(root->val);
        data.push_back(root->val);
        helper(root->right, set, data);
    }

    // 中序遍历优化，比较前后节点
    bool isValidBST2(TreeNode* root) {
        if (root == nullptr) {
            return true;
        }

        if (!isValidBST2(root->left)) {
            return false;
        }
        if (prev != nullptr && prev->val >= root->val) {
            return false;
        }
        prev = root;
        return isValidBST2(root->right);
    }
};
