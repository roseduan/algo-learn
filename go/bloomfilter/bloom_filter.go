package bloomfilter

import (
	"github.com/spaolacci/murmur3"
	"github.com/willf/bitset"
	"log"
)

//布隆过滤器简单实现

type BloomFilter struct {
	m uint //capacity
	k uint //hash count
	b *bitset.BitSet
}

func NewBloomFilter(m, k uint) *BloomFilter {
	return &BloomFilter{m, k, bitset.New(m)}
}

func (bf *BloomFilter) Add(data string) {
	for i := 0; i < int(bf.k); i++ {
		bf.b.Set(bf.location(data, i))
	}
}

//0: not exist
//1: probably exist
func (bf *BloomFilter) Contains(data string) int {
	for i := 0; i < int(bf.k); i++ {
		if !bf.b.Test(bf.location(data, i)) {
			return 0
		}
	}
	return 1
}

func (bf *BloomFilter) location(data string, seed int) uint {
	mur := murmur3.New64()
	if _, err := mur.Write([]byte(data + string(rune(seed)))); err != nil {
		log.Fatal("murmur3 error ", err)
	}

	s := mur.Sum64()
	return uint(s % uint64(bf.m))
}
