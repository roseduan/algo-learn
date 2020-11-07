package sort

import (
	"fmt"
	"math/rand"
	"sort"
	"testing"
	"time"
)

func TestMergeSort(t *testing.T) {
	data1 := []int{1}
	MergeSort(data1)
	t.Log(data1)

	data2 := []int{1, 0}
	MergeSort(data2)
	t.Log(data2)

	data3 := []int{1, 1, 1, 1, 1, 1, 1}
	MergeSort(data3)
	t.Log(data3)

	var data []int
	rand.Seed(time.Now().Unix())

	for i := 0; i < 45; i++ {
		data = append(data, rand.Intn(50))
	}

	ans := make([]int, len(data))
	copy(ans, data)
	sort.Ints(ans)
	fmt.Println(ans)

	fmt.Println(data)
	MergeSort(data)
	fmt.Println(data)
}
