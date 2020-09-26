package main

import (
	"container/list"
	"strings"
)

//有效的括号

//暴力求解，分别匹配并替换 () [] {}
func isValid1(s string) bool {
	for len(s) > 0 {
		n := len(s)
		s = strings.Replace(s, "()", "", -1)
		s = strings.Replace(s, "[]", "", -1)
		s = strings.Replace(s, "{}", "", -1)
		if len(s) == n {
			break
		}
	}
	return len(s) == 0
}

//第二种解法，借助一个栈
func isValid2(s string) bool {
	stack := list.New()
	m := map[rune]rune{')': '(', ']': '[', '}': '{'}

	for _, v := range s {
		if _, ok := m[v]; !ok {
			stack.PushFront(v)
		} else {
			e := stack.Front()
			if e == nil || e.Value != m[v] {
				return false
			}
			stack.Remove(e)
		}
	}
	return stack.Len() == 0
}
