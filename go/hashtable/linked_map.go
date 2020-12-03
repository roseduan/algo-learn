package hashtable

//哈希表简单实现，拉链法解决哈希冲突

const (
	DefaultCapacity = 16
)

//节点定义
type Node struct {
	key   interface{}
	value interface{}
	next  *Node
}

//哈希表定义
type LinkedMap struct {
	data     []*Node
	size     int
	capacity int
}

//新建一个哈希表
func New(capacity int) {

}

func (m *LinkedMap) hash() {
}
