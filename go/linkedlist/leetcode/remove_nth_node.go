package main

//删除链表倒数第N个节点

//先计数，再依次遍历
func removeNthFromEnd1(head *ListNode, n int) *ListNode {
	dummy := ListNode{0, head}
	cur := &dummy
	length := getLength(head)
	for i := 1; i < length-n+1; i++ {
		cur = cur.Next
	}
	cur.Next = cur.Next.Next
	return dummy.Next
}

func getLength(head *ListNode) int {
	n := 0
	for head != nil {
		n, head = n+1, head.Next
	}
	return n
}

//快慢指针，一次遍历
func removeNthFromEnd2(head *ListNode, n int) *ListNode {
	dummy := ListNode{0, head}
	slow, fast := &dummy, head
	for i := 0; i < n; i++ {
		fast = fast.Next
	}

	for fast != nil {
		slow, fast = slow.Next, fast.Next
	}
	slow.Next = slow.Next.Next
	return dummy.Next
}
