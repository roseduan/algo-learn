package main

// 相交链表

// 暴力法，针对headA中的每一个节点，遍历headB查看是否是重合的节点
func getIntersectionNode1(headA, headB *ListNode) *ListNode {
	for headA != nil {
		p := headB
		for p != nil {
			if headA == p {
				return headA
			}
			p = p.Next
		}
		headA = headA.Next
	}
	return nil
}

// 使用一个哈希表判重
func getIntersectionNode2(headA, headB *ListNode) *ListNode {
	s := make(map[*ListNode]bool)
	for headA != nil {
		s[headA], headA = true, headA.Next
	}
	for headB != nil {
		if s[headB] {
			return headB
		}
		headB = headB.Next
	}
	return nil
}

// 双指针法
func getIntersectionNode3(headA, headB *ListNode) *ListNode {
	p, q := headA, headB
	for p != q {
		if p == nil {
			p = headB
		} else {
			p = p.Next
		}
		if q == nil {
			q = headA
		} else {
			q = q.Next
		}
	}
	return p
}
