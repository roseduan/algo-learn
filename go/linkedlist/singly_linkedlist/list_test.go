package singly_linkedlist

import "testing"

func TestList(t *testing.T) {

	lis := New()
	lis.pushBack(1)
	lis.pushBack(3)
	e4 := lis.pushBack(4)
	lis.pushBack(6)

	lis.pushBefore(e4, 10)

	lis.pushAfter(e4, 20)

	lis.printData()
}
