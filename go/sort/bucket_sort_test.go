package sort

import (
	"fmt"
	"math/rand"
	"sort"
	"testing"
	"time"
)

func TestBucketSort(t *testing.T) {
	var data []int
	rand.Seed(time.Now().UnixNano())

	for i := 0; i < 104; i++ {
		data = append(data, rand.Intn(530))
	}

	fmt.Println(data)
	tmp := data
	fmt.Println("---------------")
	BucketSort(data)

	fmt.Println(data)
	sort.Ints(tmp)
	fmt.Println(tmp)

	data1 := []int{5, 1, 3}
	BucketSort(data1)
	t.Log("data1 ---- ", data1)

	data2 := []int{0, 0, 1, 0, 3, -5, 0, 7}
	BucketSort(data2)
	t.Log("data2 ---- ", data2)
}
