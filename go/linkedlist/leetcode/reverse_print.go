package main

//剑指Offer：倒序打印链表

//有点傻，但是代码简单的方法
func reversePrint1(head *ListNode) []int {
	var res []int
	for head != nil {
		res = append([]int{head.Val}, res...)
		head = head.Next
	}
	return res
}

//递归，本质上是借助一个栈
func reversePrint2(head *ListNode) []int {
	var res []int
	reverseHelper(head, &res)
	return res
}

func reverseHelper(node *ListNode, res *[]int) {
	if node == nil {
		return
	}

	reverseHelper(node.Next, res)
	*res = append(*res, node.Val)
}

//借助一个数组
func reversePrint3(head *ListNode) []int {
	res, data := []int{}, []int{}
	for head != nil {
		data = append(data, head.Val)
		head = head.Next
	}

	for len(data) != 0 {
		res = append(res, data[len(data)-1])
		data = data[:len(data)-1]
	}
	return res
}
