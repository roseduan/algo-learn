package main

// 两数相加II

// 反转之后，就是两数相加的问题
func addTwoNumbersII(l1 *ListNode, l2 *ListNode) *ListNode {
	p := reverse(l1)
	q := reverse(l2)
	res := addTwoNumbers(p, q)
	return reverse(res)
}

func reverse(head *ListNode) *ListNode {
	var prev *ListNode
	for head != nil {
		head.Next, head, prev = prev, head.Next, head
	}
	return prev
}

// 反序处理，可以利用栈
func addTwoNumbersII2(l1 *ListNode, l2 *ListNode) *ListNode {
	var p []*ListNode
	for l1 != nil {
		p = append(p, l1)
		l1 = l1.Next
	}

	var q []*ListNode
	for l2 != nil {
		q = append(q, l2)
		l2 = l2.Next
	}

	var res *ListNode
	count := 0
	for len(p) > 0 || len(q) > 0 {
		if len(p) > 0 {
			node := p[len(p)-1]
			p = p[:len(p)-1]
			count += node.Val
		}
		if len(q) > 0 {
			node := q[len(q)-1]
			q = q[:len(q)-1]
			count += node.Val
		}
		node := &ListNode{Val: count % 10}
		node.Next = res
		res, count = node, count/10
	}
	if count > 0 {
		node := &ListNode{Val: count}
		node.Next = res
		res = node
	}
	return res
}
