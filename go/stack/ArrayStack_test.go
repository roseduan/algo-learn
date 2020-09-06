package stack

import (
	"fmt"
	"testing"
)

func TestArrayStack(t *testing.T) {
	stack := Default()

	stack.Push(1)
	stack.Push(23)
	stack.Push(3)
	stack.Push("jack")

	peek, _ := stack.Peek()
	fmt.Println(peek)

	fmt.Println(len(stack.data))
	fmt.Println(cap(stack.data))
	fmt.Println(stack.Size())

	stack.PrintData()

	pop, _ := stack.Pop()
	pop, _ = stack.Pop()
	pop, _ = stack.Pop()
	fmt.Println(pop)
	fmt.Println(stack.Size())

	stack.PrintData()

	pop, _ = stack.Pop()
	fmt.Println(pop)
	fmt.Println(stack.Size())
	fmt.Println(stack.Empty())
}
