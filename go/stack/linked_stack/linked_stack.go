package linked_stack

import (
	"errors"
	"fmt"
)

//链式栈的实现(基于链表)

type ListNode struct {
	next *ListNode
	val  interface{}
}

type LinkedStack struct {
	head *ListNode
	size int
}

func NewLinkedStack() *LinkedStack {
	return &LinkedStack{
		head: nil,
		size: 0,
	}
}

//压栈
func (stack *LinkedStack) Push(val interface{}) {
	node := &ListNode{nil, val}
	if stack.Empty() {
		stack.head = node
	} else {
		node.next = stack.head
		stack.head = node
	}

	stack.size++
}

//出栈
func (stack *LinkedStack) Pop() (interface{}, error) {
	if stack.Empty() {
		return nil, errors.New("stack is empty")
	}

	result := stack.head.val
	stack.head = stack.head.next
	stack.size--

	return result, nil
}

//获取栈顶元素
func (stack *LinkedStack) Peek() (interface{}, error) {
	if stack.Empty() {
		return nil, errors.New("stack is empty")
	}
	return stack.head.val, nil
}

func (stack *LinkedStack) Empty() bool {
	return stack.size <= 0
}

func (stack *LinkedStack) Size() int {
	return stack.size
}

func (stack *LinkedStack) PrintData() {
	if stack.Empty() {
		fmt.Println("stack is empty")
	} else {
		for p := stack.head; p != nil; p = p.next {
			fmt.Print(p.val, " ")
		}
		fmt.Println()
	}
}
