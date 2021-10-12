package main

import "sort"

// 第一种方式，取出链表数据，排序后重新构造链表
func sortList1(head *ListNode) *ListNode {
	var data []int
	for head != nil {
		data = append(data, head.Val)
		head = head.Next
	}

	sort.Ints(data)
	dummy := &ListNode{}
	p := dummy
	for _, v := range data {
		p.Next = &ListNode{Val: v}
		p = p.Next
	}
	return dummy.Next
}

// 归并排序的思路
func sortList2(head *ListNode) *ListNode {
	if head == nil {
		return head
	}
	return sortHelper(head)
}

func sortHelper(head *ListNode) *ListNode {
	if head.Next == nil {
		return head
	}

	// 找到链表的中间节点
	mid, fast, prev := head, head, &ListNode{}
	for fast != nil && fast.Next != nil {
		prev = mid
		mid = mid.Next
		fast = fast.Next.Next
	}

	// 将链表切为两段
	prev.Next = nil
	left := sortHelper(head)
	right := sortHelper(mid)
	return merge(left, right)
}

func merge(left *ListNode, right *ListNode) *ListNode {
	dummy := &ListNode{}
	p := dummy
	for left != nil && right != nil {
		if left.Val < right.Val {
			p.Next = left
			left = left.Next
		} else {
			p.Next = right
			right = right.Next
		}
		p = p.Next
	}
	if left != nil {
		p.Next = left
	} else {
		p.Next = right
	}
	return dummy.Next
}
