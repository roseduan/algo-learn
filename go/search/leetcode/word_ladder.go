package leetcode

//单词接龙

//广度优先
func ladderLength(beginWord string, endWord string, wordList []string) int {
	wordSet, charSet := make(map[string]bool), make(map[rune]bool)
	for _, word := range wordList {
		wordSet[word] = true
		for _, c := range word {
			charSet[c] = true
		}
	}
	if !wordSet[endWord] {
		return 0
	}

	queue, res := []string{beginWord}, 0
	for len(queue) > 0 {
		n := len(queue)
		for i := 0; i < n; i++ {
			cur := queue[0]
			queue = queue[1:]
			if cur == endWord {
				return res + 1
			}
			for j := 0; j < len(cur); j++ {
				for c := range charSet {
					modStr := cur[:j] + string(c) + cur[j+1:]
					if wordSet[modStr] {
						queue = append(queue, modStr)
						delete(wordSet, modStr)
					}
				}
			}
			res++
		}
	}
	return 0
}
