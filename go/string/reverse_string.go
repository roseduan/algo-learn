package string

// 反转字符串

func reverseString(s []byte) {
	i, j := 0, len(s)-1
	for i < j {
		s[i], s[j] = s[j], s[i]
		i, j = i+1, j-1
	}
}
