package circular_queue

import "testing"

func TestCircularQueue_Enqueue(t *testing.T) {
	queue := New(5)
	queue.Enqueue(5)
	queue.Enqueue(3)
	queue.Enqueue(2)
	queue.Enqueue(1)
	queue.Enqueue(0)

	t.Logf("head = %d, tail = %d \n", queue.head, queue.tail)
	t.Log(queue.Front())
	t.Log(queue.Rear())
	t.Log(queue.data)
}
