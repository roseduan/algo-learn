package main

func oddEvenList(head *ListNode) *ListNode {
	if head == nil {
		return head
	}

	evenHead := head.Next
	odd, even := head, evenHead
	for even != nil && even.Next != nil {
		odd.Next, odd = even.Next, even.Next
		even.Next, even = odd.Next, odd.Next
	}

	odd.Next = evenHead
	return head
}
