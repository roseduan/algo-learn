package main

//电话号码的字母组合

var letters = map[byte]string{
	'2': "abc", '3': "def", '4': "ghi", '5': "jkl",
	'6': "mno", '7': "pqrs", '8': "tuv", '9': "wxyz",
}

func letterCombinations(digits string) []string {
	var res []string
	if digits == "" {
		return res
	}
	letterHelper(0, digits, "", &res)
	return res
}

func letterHelper(i int, digits string, cur string, res *[]string) {
	if i == len(digits) {
		*res = append(*res, cur[:])
		return
	}

	for _, v := range letters[digits[i]] {
		cur += string(v)
		letterHelper(i+1, digits, cur, res)
		cur = cur[:len(cur)-1]
	}
}
