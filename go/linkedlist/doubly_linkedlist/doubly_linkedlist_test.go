package doubly_linkedlist

import (
	"fmt"
	"testing"
)

func TestLinkedList_PushFront(t *testing.T) {
	list := New()
	list.PushFront(3)
	list.PushFront(5)
	list.PushFront(1)

	fmt.Println(list.Size())
	list.PrintData()
}

func TestLinkedList_PushBack(t *testing.T) {
	list := New()
	list.PushBack(3)
	list.PushBack(9)
	list.PushBack(12)

	list.PrintData()
}

func TestLinkedList_PushBefore(t *testing.T) {
	list := New()
	e1 := list.PushBack(3)
	e2 := list.PushBack(12)
	list.PushBack(9)

	list.PushBefore(e1, 4)

	list.PushBefore(e2, 83)

	fmt.Println(list.Size())
	list.PrintData()
}

func TestLinkedList_PushAfter(t *testing.T) {
	list := New()
	e1 := list.PushBack(3)
	e2 := list.PushBack(12)

	list.PushAfter(e1, 44)
	list.PushAfter(e2, 55)

	fmt.Println(list.Size())
	list.PrintData()
}

func TestLinkedList_Delete(t *testing.T) {
	list := New()
	e1 := list.PushBack(3)
	e2 := list.PushBack(5)
	e3 := list.PushBack(9)
	e4 := list.PushBack(10)

	list.PrintData()

	list.Delete(e1)
	list.Delete(e2)
	list.Delete(e3)

	list.PushBack(1)
	list.PushBack(12)
	list.PushBack(99)

	list.PrintData()

	list.Delete(e4)
	list.Delete(list.Find(1))

	list.PrintData()
	fmt.Println(e1, e2, e3, e4)
}
