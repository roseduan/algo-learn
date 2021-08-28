package leetcode

func longestConsecutive(nums []int) int {
	m := make(map[int]bool)
	for _, v := range nums {
		m[v] = true
	}
	res := 0
	for v := range m {
		if !m[v-1] {
			cur, curRes := v, 1
			for m[cur+1] {
				curRes++
				cur++
			}
			if curRes > res {
				res = curRes
			}
		}
	}
	return res
}
