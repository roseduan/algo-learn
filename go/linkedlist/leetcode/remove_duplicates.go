package main

//删除排序链表中的重复项
func deleteDuplicates1(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	prev, back := head, head.Next
	for back != nil {
		if prev.Val != back.Val {
			prev.Next = back
			prev = back
		}
		back = back.Next
	}
	prev.Next = back
	return head
}

//另一种写法
func deleteDuplicates2(head *ListNode) *ListNode {
	cur := head
	for cur != nil && cur.Next != nil {
		if cur.Val == cur.Next.Val {
			cur.Next = cur.Next.Next
		} else {
			cur = cur.Next
		}
	}
	return head
}
