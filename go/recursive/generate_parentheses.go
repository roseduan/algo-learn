package main

//生成括号

//暴力法，找出所有的括号组合，并且一一判断是否有效
func generateParenthesis1(n int) []string {
	var res []string
	generateHelper1(0, 2*n, "", &res)
	return res
}

func generateHelper1(i int, n int, s string, res *[]string) {
	if i == n {
		if isValid(s) {
			*res = append(*res, s)
		}
		return
	}

	generateHelper1(i+1, n, s+")", res)
	generateHelper1(i+1, n, s+"(", res)
}

func isValid(s string) bool {
	flag := 0
	for _, v := range s {
		if v == '(' {
			flag++
		}
		if v == ')' {
			flag--
		}
		if flag < 0 {
			return false
		}
	}
	return flag == 0
}

//递归
func generateParenthesis2(n int) []string {
	var res []string
	generateHelper2(0, 0, n, "", &res)
	return res
}

func generateHelper2(left, right, n int, s string, res *[]string) {
	if len(s) == 2*n {
		*res = append(*res, s)
		return
	}

	if left < n {
		generateHelper2(left+1, right, n, s+"(", res)
	}
	if right < left {
		generateHelper2(left, right+1, n, s+")", res)
	}
}
