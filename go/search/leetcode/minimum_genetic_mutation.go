package leetcode

//最小基因变化
func minMutation(start string, end string, bank []string) int {
	bankSet := make(map[string]bool)
	for _, s := range bank {
		bankSet[s] = true
	}
	if !bankSet[end] {
		return -1
	}

	res := 0
	queue, letters := []string{start}, []byte{'A', 'C', 'G', 'T'}
	for len(queue) > 0 {
		n := len(queue)
		for i := 0; i < n; i++ {
			cur := queue[0]
			queue = queue[1:]
			if cur == end {
				return res
			}

			for i := 0; i < len(cur); i++ {
				modStr := []byte(cur)
				for _, c := range letters {
					modStr[i] = c
					s := string(modStr)
					if bankSet[s] {
						queue = append(queue, s)
						delete(bankSet, s)
					}
				}
			}
		}
		res++
	}
	return -1
}
