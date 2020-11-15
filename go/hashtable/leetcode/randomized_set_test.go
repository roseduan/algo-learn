package leetcode

import (
	"fmt"
	"testing"
)

func TestRandomizedSet(t *testing.T) {
	set := constructor()
	fmt.Println(set.Insert(0))
	fmt.Println(set.Insert(1))

	set.Remove(0)

	fmt.Println(set.Insert(2))

	set.Remove(1)

	fmt.Println(set.m)
	fmt.Println(set.n)
}
