package main

//两两交换链表中的节点

type ListNode struct {
	Val  int
	Next *ListNode
}

func swapPairs(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	node := &ListNode{-1, nil}
	node.Next = head
	p := node
	for p.Next != nil && p.Next.Next != nil {
		front, back := p.Next, p.Next.Next
		p.Next = back
		front.Next = back.Next
		back.Next = front
		p = p.Next.Next
	}
	return node.Next
}
