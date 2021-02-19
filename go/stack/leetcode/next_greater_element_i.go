package main

//下一个更大的元素I

//暴力法
func nextGreaterElement1(nums1 []int, nums2 []int) []int {
	var res []int

	m := make(map[int]int)
	for i, v := range nums2 {
		m[v] = i
	}

	for _, v := range nums1 {
		exist := false
		for j := m[v] + 1; j < len(nums2); j++ {
			if nums2[j] > v {
				exist = true
				res = append(res, nums2[j])
				break
			}
		}
		if !exist {
			res = append(res, -1)
		}
	}
	return res
}

//使用一个栈+哈希表
func nextGreaterElement2(nums1 []int, nums2 []int) []int {
	var stack []int
	var res []int
	m := make(map[int]int)

	for _, v := range nums2 {
		for len(stack) > 0 && stack[len(stack)-1] < v {
			m[stack[len(stack)-1]] = v
			stack = stack[:len(stack)-1]
		}
		stack = append(stack, v)
	}

	for _, v := range nums1 {
		if _, exist := m[v]; exist {
			res = append(res, m[v])
		} else {
			res = append(res, -1)
		}
	}
	return res
}
