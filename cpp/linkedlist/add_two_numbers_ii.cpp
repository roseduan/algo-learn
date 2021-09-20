//
// Created by roseduan on 2021/9/18.
// 两数相加II
//
#include "vector"
#include "stack"
using namespace std;

struct ListNode {
    int val;
    ListNode *next;

    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution{
public:
    // 使用栈
    ListNode* addTwoNumbersII(ListNode* l1, ListNode* l2) {
        stack<int> s1, s2;
        while (l1) {
            s1.push(l1->val);
            l1 = l1->next;
        }
        while (l2) {
            s2.push(l2->val);
            l2 = l2->next;
        }

        ListNode *p = nullptr;
        int count = 0;
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) {
                count += s1.top();
                s1.pop();
            }
            if (!s2.empty()) {
                count += s2.top();
                s2.pop();
            }
            auto node = new ListNode(count % 10);
            node->next = p;
            p = node;
            count /= 10;
        }
        if (count > 0) {
            auto node = new ListNode(count);
            node->next = p;
            p = node;
        }
        return p;
    }
};

int main() {
    auto *node1 = new ListNode(100);
    auto *node2 = new ListNode(100);
    Solution sol;
    sol.addTwoNumbersII(node1, node2);
}
