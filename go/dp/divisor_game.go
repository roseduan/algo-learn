package main

//除数博弈

func divisorGame(N int) bool {
	for N > 1 {
		for i := N - 1; i > 0; i++ {
			if N%i == 0 {
				break
			}
		}

	}
	return false
}
