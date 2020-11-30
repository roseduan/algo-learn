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
	head *ListNode
	size int
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
	lis.size++
	return node
}

//插入数据到链表尾部
func (lis *LinkedList) PushBack(val interface{}) *ListNode {
	if lis.head == nil {
		return lis.PushFront(val)
	}

	node := newNode(val)
	p := lis.head
	for p.next != nil {
		p = p.next
	}

	p.next = node
	node.prev = p
	lis.size++
	return node
}

//在某个节点之后插入数据
func (lis *LinkedList) PushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	next := p.next
	node := newNode(val)
	node.next = next
	p.next = node
	node.prev = p
	if next != nil {
		next.prev = node
	}
	lis.size++
	return node
}

//在某个节点之前插入元素
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
		lis.size++
	}
	return node
}

//删除节点
func (lis *LinkedList) Delete(p *ListNode) {
	if p == nil || lis.head == nil {
		return
	}

	//删除的是头节点
	if p == lis.head {
		lis.head = p.next
	} else {
		prev, next := p.prev, p.next
		prev.next = next
		if next != nil {
			next.prev = prev
		}
	}
	lis.size--
}

//根据值查找节点
func (lis *LinkedList) Find(val interface{}) *ListNode {
	if lis.head == nil {
		return nil
	}

	p := lis.head
	for p != nil && p.val != val {
		p = p.next
	}
	return p
}

func (lis *LinkedList) Size() int {
	return lis.size
}

//打印所有链表数据
func (lis *LinkedList) PrintData() {
	for p := lis.head; p != nil; p = p.next {
		fmt.Print(p.val, " ")
	}
	fmt.Println()
}
