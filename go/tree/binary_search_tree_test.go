package tree

import "testing"

func TestBinarySearchTree_Add(t *testing.T) {
	bst := New()

	bst.Add(7)
	bst.Add(9)
	bst.Add(13)
	bst.Add(5)
	bst.Add(11)
	bst.Add(1)
	bst.Add(15)

	bst.PrintData()
}
