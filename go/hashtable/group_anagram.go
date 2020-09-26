package main

import (
	"sort"
	"strings"
)

//分组异位词

func groupAnagrams(strs []string) [][]string {
	m := map[string][]string{}
	var res [][]string

	for _, v := range strs {
		m[sortString(v)] = append(m[sortString(v)], v)
	}

	for _, v := range m {
		res = append(res, v)
	}
	return res
}

func sortString(s string) string {
	r := strings.Split(s, "")
	sort.Strings(r)
	return strings.Join(r, "")
}
