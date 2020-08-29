package sort

import (
	"fmt"
	"math/rand"
	"testing"
	"time"
)

func TestInsertionSort(t *testing.T) {
	one := []int{1}
	insertionSort(one)
	fmt.Println(one)

	two := []int{5, 3}
	insertionSort(two)
	fmt.Println(two)

	var data []int
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}
	insertionSort(data)

	fmt.Println(data)
}
