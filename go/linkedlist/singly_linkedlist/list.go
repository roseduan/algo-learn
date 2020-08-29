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
	return &LinkedList{nil, 0}
}

//增加数据至链表末尾
func (lis *LinkedList) PushBack(val interface{}) *ListNode {
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
func (lis *LinkedList) PushBefore(p *ListNode, val interface{}) *ListNode {
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
func (lis *LinkedList) PushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	node.next = p.next
	p.next = node
	lis.length++
	return node
}

//根据值查找链表节点
func (lis *LinkedList) Find(val interface{}) *ListNode {
	p := lis.head
	for p != nil && p.val != val {
		p = p.next
	}

	return p
}

//删除节点
func (lis *LinkedList) Delete(p *ListNode) {
	if p == nil {
		return
	}

	if p == lis.head {
		lis.head = lis.head.next
		lis.length--
	} else {
		prev := lis.head
		for prev != nil && prev.next != p {
			prev = prev.next
		}

		if prev != nil {
			prev.next = p.next
		}
	}
}

//删除值为目标的节点
func (lis *LinkedList) DeleteVal(val interface{}) {
	lis.Delete(lis.Find(val))
}

//打印链表中所有数据
func (lis *LinkedList) PrintData() {
	for p := lis.head; p != nil; p = p.next {
		fmt.Print(p.val, " ")
	}
	fmt.Println()
}
