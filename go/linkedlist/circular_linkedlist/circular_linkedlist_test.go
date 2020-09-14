package circular_linkedlist

import (
	"fmt"
	"testing"
)

func TestCircularLinkedList(t *testing.T) {
	lis := New()
	lis.PushBack(1)
	lis.PushBack(12)
	lis.PushBack(3)
	lis.PushBack(4)
	lis.PushBack(22)
	lis.PushBack(4)

	fmt.Println(lis.length)
	lis.PrintData()

	//Go语言中自带的循环链表实现：Ring
	//rin := ring.New(10)
}
