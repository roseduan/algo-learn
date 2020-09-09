package main

//加一：https://leetcode.com/problems/plus-one/

//倒序循环原数组，假设每一位上的数字为 i，如果 i < 9，则不会发生进位，直接在 i + 1 然后返回
//如果 i == 9，说明发生进位，i 变成 0，继续遍历
//如果跳出循环，仍未返回，说明全都是 9，则让第一位的数字为 1 ，并且数组长度加 1，其余位全为 0

func plusOne(digits []int) []int {
	for i := len(digits) - 1; i >= 0; i-- {
		if digits[i] == 9 {
			digits[i] = 0
		} else {
			digits[i] += 1
			return digits
		}
	}

	res := make([]int, len(digits)+1)
	res[0] = 1
	return res
}
