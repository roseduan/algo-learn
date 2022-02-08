package leetcode

// 有效的完全平方数

func isPerfectSquare(num int) bool {
	low, high := 1, num
	for low <= high {
		mid := low + (high - low) / 2
		if mid * mid > num {
			high = mid - 1
		} else if mid * mid < num {
			low = mid + 1
		} else {
			return true
		}
	}
	return false
}
