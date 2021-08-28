package sort

// 基数排序(只适用于整数)
func RadixSort(data []int) {
	if len(data) <= 1 {
		return
	}

	// 找到数组中最大值
	max := data[0]
	for _, v := range data {
		if max < v {
			max = v
		}
	}

	buckets := make([][]int, 10)
	mod := 1
	for ; max > 0; max /= 10 {
		for _, v := range data {
			buckets[(v/mod)%10] = append(buckets[(v/mod)%10], v)
		}

		count := 0
		for i, buc := range buckets {
			for _, v := range buc {
				data[count] = v
				count++
			}
			buckets[i] = []int{}
		}
		mod *= 10
	}
}
