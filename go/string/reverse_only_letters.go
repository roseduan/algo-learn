package string

import (
	"unicode"
)

// 仅仅翻转字母
func reverseOnlyLetters(S string) string {
	runes := []rune(S)
	i, j := 0, len(runes)-1
	for i < j {
		if !unicode.IsLetter(runes[i]) {
			i++
		} else if !unicode.IsLetter(runes[j]) {
			j--
		} else {
			runes[i], runes[j] = runes[j], runes[i]
			i++
			j--
		}
	}
	return string(runes)
}
