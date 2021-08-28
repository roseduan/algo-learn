package sort

import (
	"fmt"
	"math/rand"
	"sort"
	"testing"
	"time"
)

func TestQuickSort(t *testing.T) {

	data1 := []int{1}
	QuickSort(data1)
	t.Log(data1)

	data2 := []int{1, 0}
	QuickSort(data2)
	t.Log(data2)

	data3 := []int{1, 1, 1, 1, 1, 1, 1}
	QuickSort(data3)
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
	QuickSort(data)
	fmt.Println(data)

}

func TestQuickSortIteration(t *testing.T) {
	data1 := []int{4}
	QuickSortIteration(data1)
	t.Log(data1)

	data2 := []int{4, 4, 1}
	QuickSortIteration(data2)
	t.Log(data2)
}
