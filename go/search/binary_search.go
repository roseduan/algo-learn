package main

//二分查找

//迭代实现
func binarySearch1(data []int, target int) int {
	low, high := 0, len(data)-1
	for low <= high {
		mid := low + (high-low)/2
		if target > data[mid] {
			low = mid + 1
		} else if target < data[mid] {
			high = mid - 1
		} else {
			return mid
		}
	}
	return -1
}

//递归实现
func binarySearch2(data []int, target int) int {
	return helper(data, target, 0, len(data)-1)
}

func helper(data []int, target int, low int, high int) int {
	if low <= high {
		mid := low + (high-low)/2
		if data[mid] > target {
			return helper(data, target, low, mid-1)
		} else if data[mid] < target {
			return helper(data, target, mid+1, high)
		} else {
			return mid
		}
	}
	return -1
}
