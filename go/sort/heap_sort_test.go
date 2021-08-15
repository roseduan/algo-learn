package sort

import (
	"fmt"
	"math/rand"
	"testing"
	"time"
)

func TestHeapSort(t *testing.T) {
	var zero []int
	HeapSort(zero)
	fmt.Println(zero)

	one := []int{1}
	HeapSort(one)
	fmt.Println(one)

	two := []int{5, 5, 3, 3, 3, 3, 3, 3}
	HeapSort(two)
	fmt.Println(two)

	var data []int
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}
	HeapSort(data)

	fmt.Println(data)
}
