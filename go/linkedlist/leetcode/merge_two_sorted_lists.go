package main

//合并两个有序的链表

//迭代法
func mergeTwoLists1(l1 *ListNode, l2 *ListNode) *ListNode {
	node := ListNode{-1, nil}
	p := &node
	for l1 != nil && l2 != nil {
		if l1.Val < l2.Val {
			p.Next = l1
			l1 = l1.Next
		} else {
			p.Next = l2
			l2 = l2.Next
		}
		p = p.Next
	}

	if l1 != nil {
		p.Next = l1
	} else {
		p.Next = l2
	}
	return node.Next
}

//递归
func mergeTwoLists2(l1 *ListNode, l2 *ListNode) *ListNode {
	return nil
}
