package main

//装水最多的容器

//暴力法，两层循环
func maxArea1(height []int) int {
	max := 0
	for i := 0; i < len(height)-1; i++ {
		for j := i + 1; j < len(height); j++ {
			res := (j - i) * min(height[i], height[j])
			if res > max {
				max = res
			}
		}
	}

	return max
}

func min(x int, y int) int {
	if x > y {
		return y
	}

	return x
}

//双指针法
func maxArea2(height []int) int {
	max, i, j := 0, 0, len(height)-1
	for i < j {
		res := (j - i) * min(height[i], height[j])
		if res > max {
			max = res
		}

		if height[i] < height[j] {
			i++
		} else {
			j--
		}
	}

	return max
}
