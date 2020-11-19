package leetcode

// 宝石与石头
func numJewelsInStones(J string, S string) int {
	m := make(map[rune]bool)
	for _, v := range J {
		m[v] = true
	}

	res := 0
	for _, v := range S {
		if m[v] {
			res++
		}
	}
	return res
}
