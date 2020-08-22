package singly_linkedlist

import "fmt"

//单链表的实现

//节点定义
type ListNode struct {
	val  interface{}
	next *ListNode
}

//创建节点
func newNode(val interface{}) *ListNode {
	return &ListNode{val, nil}
}

//单链表结构
type LinkedList struct {
	head   *ListNode
	length int
}

func New() *LinkedList {
	lis := LinkedList{}
	lis.head = nil
	lis.length = 0
	return &lis
}

//增加数据至链表末尾
func (lis *LinkedList) pushBack(val interface{}) *ListNode {
	p := lis.head

	node := newNode(val)
	if p == nil {
		lis.head = node
	} else {
		for p.next != nil {
			p = p.next
		}
		p.next = node
	}

	lis.length++
	return node
}

//在某个节点之前插入
func (lis *LinkedList) pushBefore(p *ListNode, val interface{}) *ListNode {
	if p == nil || lis.head == nil {
		return nil
	}

	node := newNode(val)

	if p == lis.head {
		node.next = lis.head
		lis.head = node
	} else {
		prev := lis.head
		for ; prev.next != p; prev = prev.next {
		}

		node.next = p
		prev.next = node
	}
	lis.length++
	return node
}

//在某个节点之后插入
func (lis *LinkedList) pushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	node.next = p.next
	p.next = node
	lis.length++
	return node
}

//打印链表中所有数据
func (lis *LinkedList) printData() {
	for p := lis.head; p != nil; p = p.next {
		fmt.Print(p.val, " ")
	}
	fmt.Println()
}
