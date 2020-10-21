package main

// 最长公共前缀

func longestCommonPrefix(strs []string) string {
	if strs == nil || len(strs) == 0{
		return ""
	}
	
	for i := 0; i < len(strs[0]); i++ {
		c := strs[0][i]
		for j := 1; j < len(strs); j++ {
			if i == len(strs[j]) || strs[j][i] != c {
				return strs[0][:i]
			}
		}
	}
	return strs[0]
}
