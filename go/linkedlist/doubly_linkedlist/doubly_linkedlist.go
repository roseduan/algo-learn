package doubly_linkedlist

import "fmt"

//双向链表的实现

//节点定义
type ListNode struct {
	val        interface{}
	prev, next *ListNode
}

//新建节点
func newNode(val interface{}) *ListNode {
	return &ListNode{val, nil, nil}
}

//链表定义
type LinkedList struct {
	head   *ListNode
	length int
}

//新建链表
func New() *LinkedList {
	return &LinkedList{nil, 0}
}

//插入数据到链表头部
func (lis *LinkedList) PushFront(val interface{}) *ListNode {
	node := newNode(val)
	if lis.head != nil {
		lis.head.prev = node
		node.next = lis.head
	}

	lis.head = node
	lis.length++
	return node
}

//插入数据到链表尾部
func (lis *LinkedList) PushBack(val interface{}) *ListNode {
	if lis.head == nil {
		return lis.PushFront(val)
	}

	node := newNode(val)
	p := lis.head
	for ; p.next != nil; p = p.next {
	}

	p.next = node
	node.prev = p
	lis.length++
	return node
}

//在某个节点之后插入数据
func (lis *LinkedList) PushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	p.next = node
	node.prev = p
	lis.length++
	return node
}

//在某个节点之前插入元素（与单链表的主要差异体现在这里）
func (lis *LinkedList) PushBefore(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	prev := p.prev
	if prev == nil {
		lis.PushFront(val)
	} else {
		p.prev = node
		node.next = p
		prev.next = node
		node.prev = prev
	}

	lis.length++
	return node
}

//删除节点
func (lis *LinkedList) Delete(p *ListNode) {
	if p == nil || lis.head == nil {
		return
	}

	prev := p.prev
	//删除的是头节点
	if prev == nil && p == lis.head {
		lis.head = lis.head.next
		lis.length--
	} else if prev != nil {
		next := p.next
		prev.next = next
		next.prev = prev
		lis.length--
	}
}

//打印所有链表数据
func (lis *LinkedList) PrintData() {
	for p := lis.head; p != nil; p = p.next {
		fmt.Print(p.val, " ")
	}
	fmt.Println()
}
