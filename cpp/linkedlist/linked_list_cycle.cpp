// 检测链表是否有环
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

    // 使用一个哈希表
    bool hasCycle1(ListNode *head) {
        unordered_set<ListNode*> s;
        while (head) {
            auto it = s.find(head);
            if (it != s.end()) {
                return true;
            }
            head = head->next;
        }
        return false;
    }

    // 快慢指针
    bool hasCycle2(ListNode *head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while (fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
};
