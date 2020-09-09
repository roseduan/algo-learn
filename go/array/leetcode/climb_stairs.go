package main

//爬楼梯

//递归，指数级时间复杂度
//运行结果：超时
func climbStairs1(n int) int {
	if n <= 2 {
		return n
	}

	return climbStairs1(n-1) + climbStairs1(n-2)
}

//备忘录
var mem = map[int]int{}

func climbStairs2(n int) int {
	if n <= 2 {
		return n
	}

	if _, exist := mem[n]; exist {
		return mem[n]
	}
	res := climbStairs2(n-1) + climbStairs2(n-2)
	mem[n] = res
	return res
}

//动态规划的思想
func climbStairs3(n int) int {
	if n <= 2 {
		return n
	}

	prev, next := 1, 2
	for i := 2; i < n; i++ {
		prev, next = next, prev+next
	}
	return next
}
