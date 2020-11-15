package leetcode

//搜索旋转排序数组

//暴力法，线性查找
func search1(nums []int, target int) int {
	for i, v := range nums {
		if v == target {
			return i
		}
	}
	return -1
}

//二分查找
func search2(nums []int, target int) int {
	lo, hi := 0, len(nums)-1
	for lo <= hi {
		mid := lo + (hi-lo)/2
		if nums[mid] == target {
			return mid
		}

		if nums[0] <= nums[mid] {
			if nums[0] <= target && target < nums[mid] {
				hi = mid - 1
			} else {
				lo = mid + 1
			}
		} else {
			if target <= nums[len(nums)-1] && target > nums[mid] {
				lo = mid + 1
			} else {
				hi = mid - 1
			}
		}
	}
	return -1
}
