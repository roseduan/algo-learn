package sort

//冒泡排序

func BubbleSort1(data []int) {
	if data == nil || len(data) <= 1 {
		return
	}

	for i := 0; i < len(data); i++ {
		for j := 0; j < len(data)-i-1; j++ {
			if data[j] > data[j+1] {
				data[j], data[j+1] = data[j+1], data[j]
			}
		}
	}
}

//另一种写法
func BubbleSort2(data []int) {
	if data == nil || len(data) <= 1 {
		return
	}

	swap := true
	for i := 0; i < len(data) && swap; i++ {
		swap = false

		for j := 0; j < len(data)-i-1; j++ {
			if data[j] > data[j+1] {
				data[j], data[j+1] = data[j+1], data[j]
				swap = true
			}
		}
	}
}
