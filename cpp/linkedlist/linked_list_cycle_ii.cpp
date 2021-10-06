// 环形链表II
#include "unordered_set"
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

    // 使用set
    ListNode *detectCycle1(ListNode *head) {
        unordered_set<ListNode*> s;
        while (head) {
            if (s.count(head)) {
                return head;
            }
            head = head->next;
        }
        return nullptr;
    }

    // 快慢指针法
    ListNode *detectCycle2(ListNode *head) {
        ListNode* slow = head, *fast = head;
        while (fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;

            if (slow == fast) {
                ListNode* p = head;
                while (slow != p) {
                    p = p->next;
                    slow = slow->next;
                }
                return p;
            }
        }
        return nullptr;
    }
};
