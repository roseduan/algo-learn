//
// Created by roseduan on 2021/9/18.
// 两数相加

#include "iostream"
#include "stdio.h"
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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        auto *dummy = new ListNode();
        auto p = dummy;
        int count = 0;
        while (l1 || l2) {
            if (l1) {
                count += l1->val;
                l1 = l1->next;
            }
            if (l2) {
                count += l2->val;
                l2 = l2->next;
            }
            p->next = new ListNode(count % 10);
            count /= 10;
            p = p->next;
        }
        if (count > 0) {
            p->next = new ListNode(count);
        }
        return dummy->next;
    }
};

int main() {
    auto *node1 = new ListNode(8);
    node1->next = new ListNode(9);
    
    auto *node2 = new ListNode(4);
    node2->next = new ListNode(6);
    
    Solution sol;
    ListNode *res = sol.addTwoNumbers(node1, node2);
    while (res) {
        printf("%d\n", res->val);
        res = res->next;
    }
}
