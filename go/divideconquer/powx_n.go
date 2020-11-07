package main

//求x的n次方

//分治递归
func myPow(x float64, n int) float64 {
	if n < 0 {
		return 1 / powHelper(x, -n)
	}
	return powHelper(x, n)
}

func powHelper(x float64, n int) float64 {
	if n == 0 {
		return 1
	}

	res := powHelper(x, n/2)
	if n%2 == 0 {
		return res * res
	} else {
		return x * res * res
	}
}

//迭代
func myPow2(x float64, n int) float64 {
	if n == 0 {
		return 1
	}

	if n < 0 {
		return 1 / myPow2(x, -n)
	}

	ans := 1.0
	for n > 1 {
		if n%2 == 1 {
			ans *= x
		}
		x = x * x
		n /= 2
	}
	ans *= x
	return ans
}
