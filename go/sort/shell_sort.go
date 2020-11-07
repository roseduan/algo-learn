package sort

//希尔排序

func ShellSort(data []int) {
	length := len(data)
	step := length / 2
	for step >= 1 {
		for i := 0; i < length-step; i++ {
			j, k := i+step, data[i+step]
			for ; j > step-1 && data[j-step] > k; j -= step {
				data[j] = data[j-step]
			}
			data[j] = k
		}
		step /= 2
	}
}
