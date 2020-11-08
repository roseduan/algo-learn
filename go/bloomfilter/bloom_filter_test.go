package bloomfilter

import (
	"testing"
)

func TestNewBloomFilter(t *testing.T) {
	filter := NewBloomFilter(1000, 10)
	filter.Add("roseduan")
	filter.Add("roseduanasd")

	r := filter.Contains("rosed12uan1")
	t.Log(r)
}
