package main

//括号的分数
func scoreOfParentheses(S string) int {
	var stack []interface{}
	for _, val := range S {
		if val == '(' {
			stack = append(stack, val)
		} else {
			k := 0
			for stack[len(stack)-1] != '(' {
				k += stack[len(stack)-1].(int)
				stack = stack[:len(stack)-1]
			}

			if k == 0 {
				stack[len(stack)-1] = 1
			} else {
				stack[len(stack)-1] = 2 * k
			}
		}
	}

	res := 0
	for _, v := range stack {
		res += v.(int)
	}
	return res
}
