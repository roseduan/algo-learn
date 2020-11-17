package string

//字符串匹配-BF算法

func BruteForce(text, ptn string) int {
	m, n := len(text), len(ptn)
	if n > m {
		return BruteForce(ptn, text)
	}

	for i := 0; i <= m-n; i++ {
		j := 0
		for j < n && text[i+j] == ptn[j] {
			j++
		}
		if j == n {
			return i
		}
	}
	return -1
}
