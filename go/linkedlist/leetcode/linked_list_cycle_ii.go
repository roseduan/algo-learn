package main

// 环形链表II

// 使用一个set
func detectCycle1(head *ListNode) *ListNode {
	set := make(map[*ListNode]bool)
	for head != nil {
		if set[head] {
			return head
		}
		set[head], head = true, head.Next
	}
	return nil
}

func detectCycle2(head *ListNode) *ListNode {
	slow, fast := head, head
	for fast != nil && fast.Next != nil {
		slow, fast = slow.Next, fast.Next.Next
		if slow == fast {
			fast = head
			for slow != fast {
				slow, fast = slow.Next, fast.Next
			}
			return slow
		}
	}
	return nil
}
