package disjointset

//并查集代码模板

type UnionFind struct {
	count  int
	parent []int
}

func (u *UnionFind) union(p, q int) {

}

func (u *UnionFind) find(p int) int {
	for p != u.parent[p] {
		p = u.parent[p]
	}
	return p
}
