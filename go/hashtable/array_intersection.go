package main

//求两个数组的交集

func intersection(nums1 []int, nums2 []int) []int {
	if len(nums1) > len(nums2) {
		return intersection(nums2, nums1)
	}

	set := map[int]bool{}
	for _, v := range nums1 {
		set[v] = true
	}

	var res []int
	for _, v := range nums2 {
		if set[v] {
			set[v] = false
			res = append(res, v)
		}
	}
	return res
}
