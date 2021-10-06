//  链表的中间节点

#include "iostream"
#include "vector"
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

    // 快慢指针法
    ListNode* middleNode1(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while (fast && fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }

    ListNode* middleNode2(ListNode* head) {
        vector<ListNode*> lis;
        while (head)
        {
            lis.push_back(head);
            head = head->next;
        }
        return lis[lis.size() / 2];
    }
};
