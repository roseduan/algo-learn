package main

//存在重复元素II

//遍历查找
func containsNearbyDuplicate1(nums []int, k int) bool {
	for i := 0; i < len(nums)-1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i] == nums[j] && j-i <= k {
				return true
			}
		}
	}
	return false
}

//使用一个哈希表
func containsNearbyDuplicate2(nums []int, k int) bool {
	m := make(map[int]int)
	for i, n := range nums {
		if v, ok := m[n]; ok && i-v <= k {
			return true
		}
		m[n] = i
	}
	return false
}
