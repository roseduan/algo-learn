package leetcode

//将有序数组转换为二叉搜索树

func sortedArrayToBST(nums []int) *TreeNode {
	return convertHelper(nums, 0, len(nums)-1)
}

func convertHelper(nums []int, left, right int) *TreeNode {
	if left > right {
		return nil
	}

	mid := left + (right-left)/2
	root := &TreeNode{Val: nums[mid]}
	root.Left = convertHelper(nums, left, mid-1)
	root.Right = convertHelper(nums, mid+1, right)
	return root
}
