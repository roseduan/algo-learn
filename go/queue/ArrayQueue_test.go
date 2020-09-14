package queue

import (
	"fmt"
	"testing"
)

func TestArrayQueue(t *testing.T) {
	queue := NewArrayQueue(5)

	_ = queue.Enqueue(5)
	_ = queue.Enqueue(1)
	_ = queue.Enqueue(7)
	_ = queue.Enqueue(2)
	_ = queue.Enqueue(6)

	dequeue, _ := queue.Dequeue()
	fmt.Println(dequeue)

	fmt.Println(queue.Size())
	queue.PrintData()

	err := queue.Enqueue(6)
	if err != nil {
		fmt.Println("插入数据出现错误 : ", err)
	}
}
