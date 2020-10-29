package main

//反转链表

//迭代
func reverseList1(head *ListNode) *ListNode {
	var prev *ListNode
	for head != nil {
		head.Next, prev, head = prev, head, head.Next
	}
	return prev
}

//递归
func reverseList(head *ListNode) *ListNode {
	return helper(nil, head)
}

func helper(prev, cur *ListNode) *ListNode {
	if cur == nil {
		return prev
	}
	next := cur.Next
	cur.Next = prev
	return helper(cur, next)
}
