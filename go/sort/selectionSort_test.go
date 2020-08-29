package sort

import (
	"fmt"
	"math/rand"
	"testing"
	"time"
)

func TestSelectionSort(t *testing.T) {
	//只有一个数据时能否正常运行
	one := []int{1}
	selectionSort(one)
	fmt.Println(one)

	//只有两个数据时能否正常运行
	two := []int{3, 1}
	selectionSort(two)
	fmt.Println(two)

	//多个数据时是否正常运行
	var data []int
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}

	selectionSort(data)
	fmt.Println(data)
}
