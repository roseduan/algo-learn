package string

import (
	"strings"
)

// 翻转字符串中的单词III

func reverseWords1(s string) string {
	var res strings.Builder
	for _, word := range strings.Split(s, " ") {
		res.WriteString(reverseWord(word))
		res.WriteString(" ")
	}

	return res.String()[:len(res.String())-1]
}

func reverseWord(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}

// 另一种写法
func reverseWords2(s string) string {
	var res []byte
	for i := 0; i < len(s); i++ {
		start := i
		for i < len(s) && s[i] != ' ' {
			i++
		}

		for end := i - 1; end >= start; end-- {
			res = append(res, s[end])
		}
		if i != len(s) {
			res = append(res, ' ')
		}
	}
	return string(res)
}
