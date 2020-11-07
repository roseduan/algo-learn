package sort

//选择排序
func selectionSort(data []int) {
	if data == nil || len(data) <= 1 {
		return
	}

	for i := 0; i < len(data)-1; i++ {
		min := i
		for j := i + 1; j < len(data); j++ {
			if data[j] < data[min] {
				min = j
			}
		}
		data[i], data[min] = data[min], data[i]
	}
}
