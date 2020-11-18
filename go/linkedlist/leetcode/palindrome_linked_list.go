package main

// 回文链表

// 使用一个数组来存储
func isPalindrome1(head *ListNode) bool {
	var arr []int
	for ; head != nil; head = head.Next {
		arr = append(arr, head.Val)
	}

	if len(arr) > 1 {
		for i, j := 0, len(arr)-1; i < j; i, j = i+1, j-1 {
			if arr[i] != arr[j] {
				return false
			}
		}
	}
	return true
}

// 原地解决
func isPalindrome2(head *ListNode) bool {
	slow, fast := head, head
	for fast != nil && fast.Next != nil {
		slow, fast = slow.Next, fast.Next.Next
	}

	mid := slow
	if fast != nil {
		mid = slow.Next
	}

	var prev *ListNode
	var next *ListNode = mid
	for next != nil {
		next.Next, prev, next = prev, next, next.Next
	}

	for head != slow && prev != nil {
		if head.Val != prev.Val {
			return false
		}
		head, prev = head.Next, prev.Next
	}
	return true
}
