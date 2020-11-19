package main

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	dummy := &ListNode{Val: 0}
	cur, p, q, count := dummy, l1, l2, 0
	for p != nil || q != nil {
		if p != nil {
			p, count = p.Next, count+p.Val
		}
		if q != nil {
			q, count = q.Next, count+q.Val
		}
		cur.Next = &ListNode{Val: count % 10}
		cur, count = cur.Next, count/10
	}
	if count != 0 {
		cur.Next = &ListNode{Val: count}
	}
	return dummy.Next
}
