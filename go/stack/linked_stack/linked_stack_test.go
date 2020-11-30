package linked_stack

import (
	"fmt"
	"testing"
)

func TestLinkedStack(t *testing.T) {
	stack := NewLinkedStack()
	stack.Push(1)
	stack.Push(4)
	stack.Push(2)
	stack.Push(7)

	pop, _ := stack.Pop()
	fmt.Println(pop)

	peek, _ := stack.Peek()
	fmt.Println(peek)

	fmt.Println(stack.Size())
	stack.PrintData()
}
