package main

import (
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
	m := map[rune]rune{')': '(', ']': '[', '}': '{'}
	var stack []rune
	for _, v := range s {
		if _, ok := m[v]; !ok {
			stack = append(stack, v)
		} else {
			if len(stack) == 0 || stack[len(stack)-1] != m[v] {
				return false
			}
			stack = stack[:len(stack)-1]
		}
	}

	return len(stack) == 0
}

// 另一种写法
func isValid3(s string) bool {
	var stack []int
	for _, v := range s {
		if v == '(' {
			stack = append(stack, ')')
		} else if v == '[' {
			stack = append(stack, ']')
		} else if v == '{' {
			stack = append(stack, '}')
		} else {
			if len(stack) == 0 || stack[len(stack)-1] != int(v) {
				return false
			}
			stack = stack[:len(stack)-1]
		}
	}
	return len(stack) == 0
}
