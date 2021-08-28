package sort

import "testing"

func TestRadixSort(t *testing.T) {
	data1 := []int{121, 432, 0, 564, 990, 2300, 23, 1, 45, 788}
	RadixSort(data1)

	t.Log(data1)

	data2 := []int{1, 0}
	RadixSort(data2)
	t.Log(data2)
}
