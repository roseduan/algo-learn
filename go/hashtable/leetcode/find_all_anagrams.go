package leetcode

//找到字符串中所有的字母异位词

//暴力法，依次查看是否是异位词
//超出时间限制
func findAnagrams1(s string, p string) []int {
	var res []int
	m, n := len(s), len(p)
	p = sortStr(p)
	for i := 0; i <= m-n; i++ {
		if sortStr(s[i:i+n]) == p {
			res = append(res, i)
		}
	}
	return res
}
