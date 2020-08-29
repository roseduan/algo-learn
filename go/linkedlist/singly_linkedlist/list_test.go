package singly_linkedlist

import "testing"

func TestList(t *testing.T) {

	lis := New()
	lis.PushBack(1)
	lis.PushBack(3)
	e4 := lis.PushBack(4)
	lis.PushBack(6)

	lis.PushBefore(e4, 10)

	lis.PushAfter(e4, 20)
	lis.PushBack(10)

	lis.PrintData()

	//删除
	lis.DeleteVal(10)
	t.Log(lis.length)
	lis.PrintData()
}
