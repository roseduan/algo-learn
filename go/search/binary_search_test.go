package main

import (
	"fmt"
	"testing"
)

func TestBinarySearch(t *testing.T) {
	data := []int{1, 2, 3, 6, 7, 12, 15, 18, 21, 24, 26}
	search := binarySearch1(data, 1)
	fmt.Println(search)

	data1 := []int{1, 2}
	fmt.Println(binarySearch1(data1, 1), binarySearch1(data1, 2))

	data2 := []int{1}
	fmt.Println(binarySearch1(data2, 1))
}

func TestBinarySearch2(t *testing.T) {
	data := []int{1, 2, 3, 6, 7, 12, 15, 18, 21, 24, 26}
	fmt.Println(binarySearch2(data, 3))
	fmt.Println(binarySearch2(data, 12))
	fmt.Println(binarySearch2(data, 32))

	data1 := []int{1, 2}
	fmt.Println(binarySearch2(data1, 1), binarySearch1(data1, 2))

	data2 := []int{1}
	fmt.Println(binarySearch2(data2, 1))
}
