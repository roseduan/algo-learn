package string

import "testing"

func TestBruteForce(t *testing.T) {
	text := "roseduan"
	pth := "suan"

	r := BruteForce(text, pth)
	t.Log(r)
}
