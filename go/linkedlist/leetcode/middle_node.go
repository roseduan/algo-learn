package main

// 链表的中间节点

// 使用一个数组存储
func middleNode1(head *ListNode) *ListNode {
	var arr []*ListNode
	for head != nil {
		arr = append(arr, head)
		head = head.Next
	}
	return arr[len(arr)/2]
}

// 计数法，两次遍历
func middleNode2(head *ListNode) *ListNode {
	p, count := head, 0
	for p != nil {
		p, count = p.Next, count+1
	}

	p, count = head, count/2
	for count > 0 {
		p, count = p.Next, count-1
	}
	return p
}

// 快慢指针法
func middleNode3(head *ListNode) *ListNode {
	slow, fast := head, head
	for fast != nil && fast.Next != nil {
		slow, fast = slow.Next, fast.Next.Next
	}
	return slow
}
