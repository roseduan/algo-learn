package sort

import (
	"math/rand"
	"testing"
	"time"
)

const length = 100

func TestBubbleSort(t *testing.T) {
	var data []int
	//避免伪随机
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}

	BubbleSort2(data)

	t.Log(data)
}
