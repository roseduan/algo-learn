package sort

//插入排序
func insertionSort(data []int) {
	if data == nil || len(data) <= 1 {
		return
	}

	for i := 0; i < len(data)-1; i++ {
		j, k := i+1, data[i+1]
		for ; j > 0 && data[j-1] > k; j-- {
			data[j] = data[j-1]
		}
		data[j] = k
	}
}
