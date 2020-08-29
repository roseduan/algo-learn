package doubly_linkedlist

import (
	"fmt"
	"testing"
)

func TestDoublyLinkedList(t *testing.T) {
	lis := New()

	lis.PushBack(9)

	lis.PushFront(1)
	lis.PushFront(45)
	lis.PushFront(2)
	head := lis.PushFront(6)

	e19 := lis.PushBack(19)
	lis.PushBack(29)

	lis.PushBefore(e19, 100)

	fmt.Println(lis.length)
	lis.PrintData()

	fmt.Println("删除头节点")
	lis.Delete(head)

	//删除一个不存在的节点
	lis.Delete(&ListNode{2, nil, nil})
	fmt.Println(lis.length)
	lis.PrintData()

	fmt.Println("只有一个节点的删除")
	lis2 := New()
	e1 := lis2.PushFront(1)

	lis2.PrintData()
	fmt.Println(lis2.length)

	lis2.Delete(e1)
	lis2.PrintData()
	fmt.Println(lis2.length)
}
