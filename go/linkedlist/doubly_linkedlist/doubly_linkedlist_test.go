package doubly_linkedlist

import "testing"

func TestDoublyLinkedList(t *testing.T) {
	lis := New()

	lis.pushBack(9)

	lis.pushFront(1)
	lis.pushFront(45)
	lis.pushFront(2)
	lis.pushFront(6)

	e19 := lis.pushBack(19)
	lis.pushBack(29)

	lis.pushBefore(e19, 100)
	lis.printData()
}
