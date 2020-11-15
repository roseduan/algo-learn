package string

import (
	"reflect"
	"sort"
)

// 同构字符串
func isIsomorphic(s string, t string) bool {
	sm, tm := make(map[byte]int), make(map[byte]int)
	for i := 0; i < len(s); i++ {
		sm[s[i]]++
		tm[t[i]]++
	}

	var data1 []int
	for _, v := range sm {
		data1 = append(data1, v)
	}

	var data2 []int
	for _, v := range tm {
		data2 = append(data2, v)
	}

	sort.Ints(data1)
	sort.Ints(data2)
	return reflect.DeepEqual(data1, data2)
}
