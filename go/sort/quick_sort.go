package sort

//快速排序

func QuickSort(data []int) {
	quickSortHelper(data, 0, len(data)-1)
}

func quickSortHelper(data []int, lo, hi int) {
	if lo < hi {
		mid := partition(data, lo, hi)
		quickSortHelper(data, lo, mid-1)
		quickSortHelper(data, mid+1, hi)
	}
}

func partition(data []int, lo, hi int) int {
	pivot, i, j := data[hi], lo, lo
	for j < hi {
		if data[j] < pivot {
			data[j], data[i] = data[i], data[j]
			i++
		}
		j++
	}
	data[i], data[hi] = data[hi], data[i]
	return i
}

// 快速排序-迭代实现
func QuickSortIteration(data []int) {
	stack := []int{0, len(data) - 1}

	for len(stack) > 1 {
		lo, hi := stack[len(stack)-2], stack[len(stack)-1]
		stack = stack[:len(stack)-2]
		if lo < hi {
			mid := partition(data, lo, hi)
			stack = append(stack, lo, mid-1)
			stack = append(stack, mid+1, hi)
		}
	}
}
