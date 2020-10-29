package main

//括号生成

func generateParenthesis(n int) []string {
	var res []string
	generateHelper(n, 0, 0, "", &res)
	return res
}

func generateHelper(n, left, right int, cur string, res *[]string) {
	if len(cur) == 2*n {
		*res = append(*res, cur)
		return
	}

	if left < n {
		generateHelper(n, left+1, right, cur+"(", res)
	}
	if right < left {
		generateHelper(n, left, right+1, cur+")", res)
	}
}
