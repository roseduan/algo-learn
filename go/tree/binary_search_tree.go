package tree

import "fmt"

//二叉搜索树的实现

//树节点定义
type TreeNode struct {
	val   int
	left  *TreeNode
	right *TreeNode
}

func newNode(val int) *TreeNode {
	return &TreeNode{val, nil, nil}
}

//二叉搜索树定义
type BinarySearchTree struct {
	root *TreeNode
}

func New() *BinarySearchTree {
	return &BinarySearchTree{nil}
}

func (b *BinarySearchTree) Add(val int) {
	node := newNode(val)
	p := b.root
	if p == nil {
		b.root = node
	} else {
		for true {
			if p.val > val {
				if p.left == nil {
					p.left = node
					return
				}
				p = p.left
			} else {
				if p.right == nil {
					p.right = node
					return
				}
				p = p.right
			}
		}
	}
}

func (b *BinarySearchTree) Find(val int) *TreeNode {
	p := b.root
	for p != nil && p.val != val {
		if p.val > val {
			p = p.left
		} else {
			p = p.right
		}
	}
	return p
}

func (b *BinarySearchTree) Delete(val int) bool {
	p := b.root
	for p != nil && p.val != val {
		if p.val > val {
			p = p.left
		} else {
			p = p.right
		}
	}
	return true
}

//打印树中的所有数据（采用中序遍历）
func (b *BinarySearchTree) PrintData() {
	p := b.root
	helper(p)
	fmt.Println()
}

func helper(p *TreeNode) {
	if p == nil {
		return
	}

	helper(p.left)
	fmt.Print(p.val, " ")
	helper(p.right)
}
