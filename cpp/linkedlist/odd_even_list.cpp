//  奇偶链表

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

    ListNode* oddEvenList(ListNode* head) {
        if (head == nullptr) {
            return head;
        }

        ListNode* evenHead = head->next;
        ListNode* odd = head;
        ListNode* even = evenHead;

        while (even && even->next != nullptr) {
            odd->next = even->next;
            odd = odd->next;
            even->next = odd->next;
            even = even->next;
        }
        odd->next = evenHead;
        return head;
    }
};
