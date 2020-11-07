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
	return false
}
