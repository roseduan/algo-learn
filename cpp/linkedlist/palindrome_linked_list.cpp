// 回文链表

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
    // 放入数组再比较
    bool isPalindrome1(ListNode* head) {
        vector<int> arr;
        while (head) {
            arr.push_back(head->val);
            head = head->next;
        }
        for (int i = 0, j = arr.size() - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    // 找到中间节点再反转再比较
    bool isPalindrome2(ListNode* head) {
        // 找到中间节点
        ListNode* slow = head, *fast = head;
        while (fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;
        }

        // 反转
        ListNode* prev = nullptr, *p = head;
        while (p != slow) {
            ListNode* next = p->next;
            p->next = prev;
            prev = p;
            p = next;
        }

        ListNode* q = slow;
        if (fast != nullptr) {
            q = slow->next;
        }

        while (prev && q) {
            if (prev->val != q->val) {
                return false;
            }
            prev = prev->next;
            q = q->next;
        }
        return true;
    }
};
