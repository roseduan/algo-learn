package string

import (
	"unicode"
)

// 验证回文串

func isPalindrome(s string) bool {
	i, j := 0, len(s)-1
	for i < j {
		if !unicode.IsLetter(rune(s[i])) && !unicode.IsDigit(rune(s[i])) {
			i++
		} else if !unicode.IsLetter(rune(s[j])) && !unicode.IsDigit(rune(s[j])) {
			j--
		} else if unicode.ToLower(rune(s[i])) != unicode.ToLower(rune(s[j])) {
			return false
		} else {
			i++
			j--
		}
	}
	return true
}
