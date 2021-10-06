// 相交链表

#include "iostream"
#include "set"
using namespace std;

struct ListNode {
    int val;
    ListNode *next;

    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:

    // 使用一个集合
    ListNode *getIntersectionNode1(ListNode *headA, ListNode *headB) {
        set<ListNode*> s;
        while (headA) {
            s.insert(headA);
            headA = headA->next;
        }
        while (headB) {
            auto it = s.find(headB);
            if (it != s.end()) {
                return headB;
            }
            headB = headB->next;
        }
        return nullptr;
    }

    // 双指针法
    ListNode *getIntersectionNode2(ListNode *headA, ListNode *headB) {
        ListNode* p = headA;
        ListNode* q = headB;
        while (p != q) {
            p = p == nullptr ? headB : p->next;
            q = q == nullptr ? headA : q->next;
        }
        return p;
    }
};
