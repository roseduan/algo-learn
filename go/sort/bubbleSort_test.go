package sort

import (
	"math/rand"
	"testing"
	"time"
)

const length = 100

func TestBubbleSort1(t *testing.T) {
	var data []int
	//避免伪随机
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}

	BubbleSort2(data)

	t.Log(data)
}

func TestBubbleSort2(t *testing.T) {
	data1 := []int{1}
	BubbleSort3(data1)
	t.Log(data1)

	data2 := []int{1, 0}
	BubbleSort3(data2)
	t.Log(data2)

	var data []int
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}

	BubbleSort3(data)
	t.Log(data)
}
