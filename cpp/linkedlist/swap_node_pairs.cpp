#include "iostream"
#include "vector"
using namespace std;

// 两两交换链表的节点

struct ListNode {
    int val;
    ListNode *next;
    
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {

public:

    // 递归
    ListNode* swapPairs(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }

        ListNode* one = head, *two = head->next, *three = head->next->next;
        two->next = one;
        one->next = swapPairs(three);
        return two;
    }

    // 迭代的方式
    ListNode* swapPairs1(ListNode* head) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        ListNode* p = dummy;
        while (p->next && p->next->next) {
            ListNode* prev = p->next, *back = p->next->next;
            prev->next = back->next;
            back->next = prev;
            p->next = back;
            p = p->next->next;
        }
        return dummy->next;
    }
};


//      1     2     3     4
// p  prev  back
