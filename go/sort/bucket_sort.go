package sort

import (
	"math"
	"sort"
)

// 桶数量，可调整
const bucketNum = 10

// 桶排序
func BucketSort(data []int) {
	if len(data) == 0 {
		return
	}

	// 寻找到最大值和最小值
	min, max := math.MaxInt32, math.MinInt32
	for _, v := range data {
		if v < min {
			min = v
		}
		if v > max {
			max = v
		}
	}
	// 这里可能有整数溢出，根据实际情况再进行调整
	if min < 0 {
		for i := range data {
			data[i] += -min
		}
		max += -min
	}
	if max == 0 {
		return
	}

	// 新建桶并进行划分
	threshold := max / bucketNum
	if max%bucketNum != 0 {
		threshold += 1
	}
	var buckets [bucketNum + 1][]int
	for _, v := range data {
		buckets[v/threshold] = append(buckets[v/threshold], v)
	}

	// 桶内排序并拷贝回原数组
	var k int
	for i := 0; i < bucketNum+1; i++ {
		sort.Ints(buckets[i])
		for _, v := range buckets[i] {
			if min < 0 {
				v += min
			}
			data[k] = v
			k++
		}
	}
}
