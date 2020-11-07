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
