package sort

// 堆排序
func HeapSort(data []int) {
	// 构建堆
	length := len(data)
	for i := (length - 2) / 2; i >= 0; i-- {
		heapify(data, length, i)
	}

	// 排序
	for length > 0 {
		length--
		data[length], data[0] = data[0], data[length]
		heapify(data, length, 0)
	}
}

func heapify(data []int, size, i int) {
	for {
		max := i
		if 2*i+1 < size && data[2*i+1] > data[max] {
			max = 2*i + 1
		}
		if 2*i+2 < size && data[2*i+2] > data[max] {
			max = 2*i + 2
		}
		if i == max {
			break
		}
		data[i], data[max] = data[max], data[i]
		i = max
	}
}
