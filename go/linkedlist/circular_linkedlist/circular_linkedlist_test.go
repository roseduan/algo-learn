package circular_linkedlist

import (
	"fmt"
	"testing"
)

func TestLinkedList_Find(t *testing.T) {
	lis := New()
	lis.PushBack(1)
	lis.PushBack(12)
	lis.PushBack(3)

	e1 := lis.Find(3)
	e2 := lis.Find(1)
	fmt.Println(e1.val)
	fmt.Println(e2.val)
}

func TestLinkedList_PushBack(t *testing.T) {
	lis := New()
	lis.PushBack(1)
	lis.PushBack(12)
	lis.PushBack(3)
	lis.PushBack(4)
	lis.PushBack(22)
	lis.PushBack(4)

	fmt.Println(lis.size)
	lis.PrintData()
}

func TestLinkedList_PushAfter(t *testing.T) {
	lis := New()
	first := lis.PushBack(1)
	lis.PushBack(12)
	e := lis.PushBack(3)

	lis.PrintData()

	lis.PushAfter(e, 5)
	lis.PushAfter(first, 100)

	lis.PushBack(200)
	lis.PushBack(55)

	fmt.Println(lis.Size())
	lis.PrintData()
}

func TestLinkedList_PushBefore(t *testing.T) {
	lis := New()
	first := lis.PushBack(1)
	lis.PushBack(2)
	e1 := lis.PushBack(3)
	e2 := lis.PushBack(4)

	lis.PushBefore(e1, 100)
	lis.PushBefore(e2, 200)
	lis.PushBefore(first, 300)

	fmt.Println(lis.Size())
	lis.PrintData()
}

func TestLinkedList_Delete(t *testing.T) {
	lis := New()
	first := lis.PushBack(1)
	lis.PushBack(3)
	lis.PushBack(5)
	e1 := lis.PushBack(6)
	e2 := lis.PushBack(8)
	lis.PrintData()

	lis.Delete(first)
	lis.Delete(e1)
	lis.Delete(e2)
	lis.PrintData()

	fmt.Println(first)
}
