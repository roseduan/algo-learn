package disjointset

import (
	"testing"
)

func TestDisjointSet(t *testing.T) {

	u := NewUnionFind(10)
	r := u.Find(3)
	t.Log(r)
	t.Log(u.Find(2))

	t.Log(u.count)

	t.Log("-------------")
	u.Union(1, 5)
	t.Log(u.Find(1))
	t.Log(u.Find(5))
	t.Log(u.count)
}
