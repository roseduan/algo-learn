package main

//k个一组翻转链表

// 暴力法，使用一个数组存储数据，然后再翻转数据重新构造链表
func reverseKGroup1(head *ListNode, k int) *ListNode {
	var arr []int
	for head != nil {
		arr = append(arr, head.Val)
		head = head.Next
	}

	dummy := &ListNode{Val: 0}
	cur, step := dummy, 0
	for i := 0; i < len(arr); i++ {
		if i == step && step+k <= len(arr) {
			reverseArr(arr, i, i+k-1)
			step += k
		}
		cur.Next = &ListNode{Val: arr[i]}
		cur = cur.Next
	}
	return dummy.Next
}

func reverseArr(arr []int, i, j int) {
	for i < j {
		arr[i], arr[j] = arr[j], arr[i]
		i++
		j--
	}
}
