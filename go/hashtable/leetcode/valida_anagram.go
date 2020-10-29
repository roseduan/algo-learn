package leetcode

import (
	"sort"
	"strings"
)

//有效的字母异位词

//直接排序后比较
func isAnagram1(s string, t string) bool {
	return sortStr(s) == sortStr(t)
}

func sortStr(s string) string {
	r := strings.Split(s, "")
	sort.Strings(r)
	return strings.Join(r, "")
}

//使用一个map
func isAnagram2(s string, t string) bool {
	m := map[int]int{}
	for _, v := range s {
		m[int(v)] += 1
	}

	for _, v := range t {
		m[int(v)] -= 1
		if m[int(v)] == -1 {
			return false
		}
		if m[int(v)] == 0 {
			delete(m, int(v))
		}
	}
	return len(m) == 0
}

//由于只包含小写字母，因此可以使用一个数组来代替map
func isAnagram3(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	nums := [26]int{}
	for _, v := range s {
		nums[v-'a']++
	}
	for _, v := range t {
		nums[v-'a']--
		if nums[v-'a'] < 0 {
			return false
		}
	}
	return true
}
