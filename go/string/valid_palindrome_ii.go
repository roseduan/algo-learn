package string

// 验证回文字符串II

func validPalindrome(s string) bool {
	i, j := 0, len(s)-1
	for i < j {
		if s[i] != s[j] {
			return valid(s, i+1, j) || valid(s, i, j-1)
		} else {
			i, j = i+1, j-1
		}
	}
	return true
}

func valid(s string, i, j int) bool {
	for i < j {
		if s[i] == s[j] {
			i, j = i+1, j-1
		} else {
			return false
		}
	}
	return true
}
