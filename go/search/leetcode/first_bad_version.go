package leetcode

// 第一个错误的版本

/**
 * Forward declaration of isBadVersion API.
 * @param   version   your guess about first bad version
 * @return 	 	      true if current version is bad
 *			          false if current version is good
 */

// 由系统提供实现
func isBadVersion(version int) bool {
	return false
}

func firstBadVersion(n int) int {
	low, high := 1, n
	for low <= high {
		mid := low + (high-low)/2
		if isBadVersion(mid) {
			if mid == low || !isBadVersion(mid-1) {
				return mid
			}
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return high
}
