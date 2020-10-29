package main

//环形链表

//使用set判重
func hasCycle1(head *ListNode) bool {
	set := map[*ListNode]bool{}
	for head != nil {
		if _, ok := set[head]; ok {
			return true
		}
		set[head] = true
		head = head.Next
	}
	return false
}

//快慢指针法
func hasCycle2(head *ListNode) bool {
	slow, fast := head, head
	for fast != nil && fast.Next != nil {
		slow, fast = slow.Next, fast.Next.Next
		if slow == fast {
			return true
		}
	}
	return false
}
