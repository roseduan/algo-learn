package leetcode

// 在排序数组中查找元素的第一个和最后一个位置

// 直接遍历查找
func searchRange1(nums []int, target int) []int {
	j := -1
	for i, v := range nums {
		if v == target {
			j = i
			break
		}
	}
	k := j
	for i := j + 1; i < len(nums) && nums[i] == target; i++ {
		k = i
	}
	return []int{j, k}
}

// 二分查找
func searchRange2(nums []int, target int) []int {
	lo, hi := 0, len(nums)-1
	for lo <= hi {
		mid := lo + (hi-lo)/2
		if nums[mid] > target {
			hi = mid - 1
		} else if nums[mid] < target {
			lo = mid + 1
		} else {
			if nums[lo] == target && nums[hi] == target {
				return []int{lo, hi}
			}
			if nums[lo] != target {
				lo++
			}
			if nums[hi] != target {
				hi--
			}
		}
	}
	return []int{-1, -1}
}
