package singly_linkedlist

import "fmt"

//单链表的实现

//节点定义
type ListNode struct {
	Val  interface{}
	Next *ListNode
}

//创建节点
func newNode(val interface{}) *ListNode {
	return &ListNode{val, nil}
}

//单链表结构
type LinkedList struct {
	head *ListNode
	size int
}

func New() *LinkedList {
	return &LinkedList{nil, 0}
}

//增加数据至链表末尾
func (lis *LinkedList) PushBack(val interface{}) *ListNode {
	p := lis.head

	node := newNode(val)
	if p == nil {
		lis.head = node
	} else {
		for p.Next != nil {
			p = p.Next
		}
		p.Next = node
	}

	lis.size++
	return node
}

//在某个节点之前插入
func (lis *LinkedList) PushBefore(p *ListNode, val interface{}) *ListNode {
	if p == nil || lis.head == nil {
		return nil
	}

	node := newNode(val)

	if p == lis.head {
		node.Next = lis.head
		lis.head = node
	} else {
		prev := lis.head
		for ; prev.Next != p; prev = prev.Next {
		}

		node.Next = p
		prev.Next = node
	}
	lis.size++
	return node
}

//在某个节点之后插入
func (lis *LinkedList) PushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	node.Next = p.Next
	p.Next = node
	lis.size++
	return node
}

//根据值查找链表节点
func (lis *LinkedList) Find(val interface{}) *ListNode {
	p := lis.head
	for p != nil && p.Val != val {
		p = p.Next
	}

	return p
}

//删除节点
func (lis *LinkedList) Delete(p *ListNode) {
	if p == nil {
		return
	}

	if p == lis.head {
		lis.head = lis.head.Next
		lis.size--
	} else {
		prev := lis.head
		for prev != nil && prev.Next != p {
			prev = prev.Next
		}

		if prev != nil {
			prev.Next = p.Next
			lis.size--
		}
	}
}

//删除值为目标的节点
func (lis *LinkedList) DeleteVal(val interface{}) {
	lis.Delete(lis.Find(val))
}

func (lis *LinkedList) Size() int {
	return lis.size
}

//打印链表中所有数据
func (lis *LinkedList) PrintData() {
	for p := lis.head; p != nil; p = p.Next {
		fmt.Print(p.Val, " ")
	}
	fmt.Println()
}
