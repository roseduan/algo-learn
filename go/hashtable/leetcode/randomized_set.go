package leetcode

import (
	"math/rand"
	"time"
)

type RandomizedSet struct {
	m map[int]int
	n []int
}

func constructor() RandomizedSet {
	var n []int
	return RandomizedSet{make(map[int]int), n}
}

func (this *RandomizedSet) Insert(val int) bool {
	if _, ok := this.m[val]; ok {
		return false
	}

	this.n = append(this.n, val)
	this.m[val] = len(this.n) - 1
	return true
}

func (this *RandomizedSet) Remove(val int) bool {
	if _, ok := this.m[val]; !ok {
		return false
	}

	n, idx := len(this.n), this.m[val]
	this.m[this.n[n-1]] = idx
	this.n[n-1], this.n[idx] = this.n[idx], this.n[n-1]

	delete(this.m, val)
	this.n = this.n[:n-1]
	return true
}

func (this *RandomizedSet) GetRandom() int {
	rand.Seed(time.Now().UnixNano())
	return this.n[rand.Intn(len(this.n))]
}
