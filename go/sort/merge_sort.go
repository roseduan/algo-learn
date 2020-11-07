package sort

//归并排序

func MergeSort(data []int) {
	mergeSortHelper(data, 0, len(data)-1)
}

func mergeSortHelper(data []int, lo, hi int) {
	if lo < hi {
		mid := lo + (hi-lo)/2
		mergeSortHelper(data, lo, mid)
		mergeSortHelper(data, mid+1, hi)
		merge(data, lo, mid, hi)
	}
}

func merge(data []int, lo, mid, hi int) {
	temp := make([]int, hi-lo+1)
	i, j, k := lo, mid+1, 0
	for i <= mid && j <= hi {
		if data[i] < data[j] {
			temp[k] = data[i]
			i++
		} else {
			temp[k] = data[j]
			j++
		}
		k++
	}
	copy(temp[k:], data[i:mid+1])
	copy(temp[k:], data[j:hi+1])
	copy(data[lo:hi+1], temp[:])
}
