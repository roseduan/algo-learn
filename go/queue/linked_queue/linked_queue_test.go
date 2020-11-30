package linked_queue

import (
	"fmt"
	"testing"
)

func TestLinkedQueue_Enqueue(t *testing.T) {
	queue := New()
	queue.Enqueue(4)
	queue.Enqueue(6)
	queue.Enqueue(7)
	queue.Enqueue(9)

	fmt.Println(queue.Dequeue().val)
	fmt.Println(queue.Dequeue().val)

	queue.PrintData()
}
