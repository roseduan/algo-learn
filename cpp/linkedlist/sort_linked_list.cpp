// 排序链表

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

    // 先放到数组，再重新构造链表
    ListNode* sortList1(ListNode* head) {
        vector<int> data;
        while (head) {
            data.push_back(head->val);
            head = head->next;
        }

        sort(data.begin(), data.end());
        ListNode* dummy = new ListNode(0);
        ListNode* p = dummy;
        for (int i : data) {
            p->next = new ListNode(i);
            p = p->next;
        }
        return dummy->next;
    }

    // 使用归并排序的思路
    ListNode* sortList2(ListNode* head) {
        return head == nullptr ? nullptr : sortHelper(head);
    }

    ListNode* sortHelper(ListNode* head) {
        if (head->next == nullptr) {
            return head;
        }

        // 找到中间节点
        ListNode* prev = nullptr;
        ListNode* mid = head, *fast = head;
        while (fast && fast->next) {
            prev = mid;
            mid = mid->next;
            fast = fast->next->next;
        }

        // 把链表分为两段
        prev->next = nullptr;
        ListNode *l = sortHelper(head);
        ListNode *r = sortHelper(mid);
        return merge(l, r);
    }

    // 合并链表
    ListNode* merge(ListNode* l, ListNode* r) {
        ListNode* dummy = new ListNode;
        ListNode* p = dummy;
        while (l && r) {
            if (l->val < r->val) {
                p->next = l;
                l = l->next;
            } else {
                p->next = r;
                r = r->next;
            }
            p = p->next;
        }
        p->next = l == nullptr ? r : l;
        return dummy->next;
    }
};
