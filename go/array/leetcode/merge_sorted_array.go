package main

import (
	"fmt"
	"sync/atomic"
)

//合并两个有序数组

//新建一个临时数组

func main() {
	var a int32 = 0
	chn := make(chan bool, 3)
	for i := 0; i < 3; i++ {
		go func(i int) {
			fmt.Println("执行的顺序 : ", i+1)
			defer func() {
				chn <- true
			}()

			for i := 0; i < 5000; i++ {
				atomic.AddInt32(&a, 1)
				//a++
			}
		}(i)
	}

	<-chn
	<-chn
	<-chn
	fmt.Println(a)
}

func merge1(nums1 []int, m int, nums2 []int, n int) {
	var temp []int

	for i := 0; i < 3; i++ {
		temp = append(temp, nums1[i])
	}

	i, j, k := 0, 0, 0
	for i < m && j < n {
		if temp[i] < nums2[j] {
			nums1[k] = temp[i]
			i++
		} else {
			nums1[k] = nums2[j]
			j++
		}
		k++
	}

	if i != m {
		copy(nums1[k:], temp[:i])
	} else {
		copy(nums1[k:], nums2[:j])
	}
}
