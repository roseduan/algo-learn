// N 叉树的最大深度

#include "iostream"
#include "vector"
#include "queue"
#include "algorithm"

using namespace std;

// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
public:

    // 深度优先
    int maxDepth(Node* root) {
        if (!root) {
            return 0;
        }
        int res = 0;
        for (Node* node : root->children) {
            res = max(res, maxDepth(node));
        }
        return res + 1;
    }

    // 广度优先
    int maxDepth1(Node* root) {
        if (!root) {
            return 0;
        }

        queue<Node*> que;
        int depth = 0;
        que.push(root);
        while (!que.empty()) {
            int size = que.size();
            while (size-- > 0) {
                Node* node = que.front();
                que.pop();
                for (Node* n : node->children) {
                    que.push(n);
                }
            }
            depth++;
        }
        return depth;
    }
};
