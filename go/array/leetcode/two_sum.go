package main

//两数之和

//暴力求解
func twoSum1(nums []int, target int) []int {
	for i := 0; i < len(nums)-1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+nums[j] == target {
				return []int{i, j}
			}
		}
	}
	return nil
}

//借助一个哈希表
func twoSum2(nums []int, target int) []int {
	m := map[int]int{}
	for i := 0; i < len(nums); i++ {
		if v, ok := m[target-nums[i]]; ok {
			return []int{v, i}
		} else {
			m[nums[i]] = i
		}
	}
	return nil
}
