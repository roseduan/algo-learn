package sort

import (
	"fmt"
	"math/rand"
	"testing"
	"time"
)

func TestShellSort(t *testing.T) {
	data1 := []int{1}
	ShellSort(data1)
	fmt.Println(data1)

	data2 := []int{3, 1}
	ShellSort(data2)
	fmt.Println(data2)

	data3 := []int{3, 9, 0, 1, 3, 2, 5, 7, 7, 4}
	ShellSort(data3)
	fmt.Println(data3)

	var data []int
	rand.Seed(time.Now().Unix())

	for i := 0; i < length; i++ {
		data = append(data, rand.Intn(1000))
	}

	ShellSort(data)
	fmt.Println(data)
}
