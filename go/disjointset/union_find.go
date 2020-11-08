package disjointset

//并查集代码模板

type UnionFind struct {
	parent []int
	count  int
}

func NewUnionFind(capacity int) *UnionFind {
	parent := make([]int, capacity)
	for i := 0; i < capacity; i++ {
		parent[i] = i
	}
	return &UnionFind{parent, capacity}
}

func (u *UnionFind) Union(p, q int) {
	pSet, qSet := u.Find(p), u.Find(q)
	if u.parent[pSet] != qSet {
		u.parent[pSet] = qSet
		u.count--
	}
}

func (u *UnionFind) Find(p int) int {
	for p != u.parent[p] {
		p = u.parent[p]
	}
	return p
}

func (u *UnionFind) Connected(p, q int) bool {
	return u.Find(p) == u.Find(q)
}
