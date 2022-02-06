package leetcode

// x的平方根

func sqrtx(x int) int {
	low, high := 1, x
	for low <= high {
		mid := low + (high-low)/2
		if x/mid < mid {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return high
}
