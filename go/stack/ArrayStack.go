package stack

import (
	"errors"
	"fmt"
)

//顺序栈的实现（基于数组）

const DefaultCapacity = 16

type ArrayStack struct {
	data     []interface{}
	size     int
	capacity int
}

//新建数组
func New(capacity int) *ArrayStack {
	return &ArrayStack{
		data:     make([]interface{}, 0, capacity),
		size:     0,
		capacity: capacity,
	}
}

func Default() *ArrayStack {
	return New(DefaultCapacity)
}

//压栈，往栈中加入数据
func (stack *ArrayStack) Push(val interface{}) error {
	if stack.size == stack.capacity {
		return errors.New("stack is full")
	}

	stack.data = append(stack.data, val)
	stack.size++
	return nil
}

//出栈，取出栈顶数据
func (stack *ArrayStack) Pop() (interface{}, error) {
	if stack.Empty() {
		return nil, errors.New("stack is empty")
	}

	stack.size--
	result := stack.data[stack.size]
	stack.data[stack.size] = nil

	return result, nil
}

//获取栈顶元素
func (stack *ArrayStack) Peek() (interface{}, error) {
	if stack.Empty() {
		return nil, errors.New("stack is empty")
	}
	return stack.data[stack.size-1], nil
}

func (stack *ArrayStack) Size() int {
	return stack.size
}

func (stack *ArrayStack) Empty() bool {
	return stack.size <= 0
}

func (stack *ArrayStack) PrintData() {
	if stack.Empty() {
		fmt.Println("stack is empty")
	} else {
		for i := stack.size - 1; i >= 0; i-- {
			fmt.Print(stack.data[i], " ")
		}
		fmt.Println()
	}
}
