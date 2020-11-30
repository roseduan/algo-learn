package singly_linkedlist

import (
	"fmt"
	"testing"
)

func TestLinkedList_PushBack(t *testing.T) {
	list := New()
	list.PushBack(2)
	list.PushBack(34)
	list.PushBack(22)
	list.PushBack(8)

	list.PrintData()
	t.Log(list.size)
}

func TestLinkedList_PushBefore(t *testing.T) {
	list := New()

	list.PushBack(34)
	list.PushBack(22)
	list.PushBack(8)

	e := list.Find(34)
	list.PushBefore(e, 99)

	list.PushBefore(e, 88)
	list.PrintData()

	e1 := list.Find(8)
	list.PushBefore(e1, 10)
	list.PrintData()
}

func TestLinkedList_PushAfter(t *testing.T) {
	list := New()

	e := list.PushBack(34)

	list.PushAfter(e, 2)
	list.PrintData()

	list.PushAfter(e, 54)
	list.PrintData()
}

func TestLinkedList_Find(t *testing.T) {
	list := New()
	list.PushBack(2)
	list.PushBack(34)
	list.PushBack(22)
	list.PushBack(8)

	e := list.Find(22)
	t.Log(e.Val)

	if e1 := list.Find(323); e1 != nil {
		t.Error("incorrect val found")
	}
}

func TestLinkedList_Delete(t *testing.T) {
	list := New()
	list.PushBack(2)
	list.PushBack(34)
	list.PushBack(22)

	list.PushBack(8)

	fmt.Println(list.size)
	list.PrintData()
	e := list.Find(2)
	list.Delete(e)

	fmt.Println(list.size)
	list.PrintData()

	list.DeleteVal(22)
	fmt.Println(list.size)
	list.PrintData()

	list.DeleteVal(34)
	list.DeleteVal(8)

	fmt.Println(list.size)
	list.PrintData()
}
