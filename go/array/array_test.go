package array

import (
	"fmt"
	"testing"
)

func TestArray(t *testing.T) {
	sli := make([]int, 5, 10)
	sli = append(sli, 1, 2, 3, 4)
	fmt.Println(sli)
	fmt.Println(sli[5:8])
	fmt.Println(sli[0:2])

	fmt.Println("------")
	index := 2
	src := []int{1, 2, 3, 4, 5, 0}
	copy(src[index+1:], src[index:])

	fmt.Println(src)

	//测试array
	fmt.Println("---array---")
	arr := New(3)

	fmt.Println(cap(arr.data))

	arr.Append(1)
	arr.Append(4)
	arr.Append(5)
	arr.Append(12)
	arr.Append(15)

	arr.Add(2, "new one")
	arr.Delete(0)

	fmt.Println(arr.length)
	fmt.Println(cap(arr.data))
	arr.PrintData()
}
