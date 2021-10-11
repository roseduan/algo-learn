// 删除链表中倒数第 k 个节点

struct ListNode {
    int val;
    ListNode *next;

    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:

    // 两遍扫描
    ListNode* removeNthFromEnd1(ListNode* head, int n) {
        if (!head || !head->next) {
            return nullptr;
        }
        int count = 0;
        ListNode* c = head;
        while (c) {
            count++;
            c = c->next;
        }

        if (count - n == 0) {
            return head->next;
        }

        ListNode* prev = head, *p = head;
        for (int i = 0; i < count - n; i++) {
            prev = p;
            p = p->next;
        }

        prev->next = prev->next->next;
        return head;
    }

    // 快慢指针法
    ListNode* removeNthFromEnd2(ListNode* head, int n) {
        ListNode* fast = head;
        for (int i = 0; i < n; ++i) {
            fast = fast->next;
        }

        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        ListNode* slow = dummy;

        while (fast != nullptr) {
            slow = slow->next;
            fast = fast->next;
        }

        slow->next = slow->next->next;
        return dummy->next;
    }
};
