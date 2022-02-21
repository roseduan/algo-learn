# algo-learn
学习数据结构与算法的代码示例，目前提供 Java、Python、Go 支持（C++ 也慢慢开始了）。维护这个 Repository 的目的有两个：

* 编程是一门实践的艺术，多多练习，多多思考，把这里列举的所有算法、数据结构，以及对应的常见 leetcode 习题都自己手敲几遍，增强自己的**编码基本功**，写出高质量的代码。

* 同时也给刷题的朋友一些指导，面对 Leetcode 上千道题目，可能会觉得手足无措，想刷题但是又不知道从哪里开始。

这里记录的是我自己的刷题过程，基本上都是一些 easy 和 medium 的题目，并且分类详细，你可以参考这个顺序，然后有针对性的去刷题。

这些题目在面试中也是比较高频的，**应对大多数面试**已经是绰绰有余了。

**Repo 逐步完善中，欢迎补充更多题目，以及贡献代码！**

## 数组

* 实现一个动态扩容的数组【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/GenericArray.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/array.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/array.go)】

* 常见 leetcode 练习题：

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|    1     |    [两数之和](https://leetcode-cn.com/problems/two-sum/)     | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/TwoSum.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/two_sum.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/two_sum.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/two_sum.cpp) |   简单   |
|   283    |   [移动零](https://leetcode-cn.com/problems/move-zeroes/)    | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/MoveZero.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/move_zero.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/move_zero.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/move_zeros.cpp) |   简单   |
|   217    | [存在重复元素](https://leetcode-cn.com/problems/contains-duplicate/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ContainsDuplicate.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/contains_duplicate.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/contains_duplicate.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/%20contains_duplicate.cpp) |   简单   |
|   219    | [存在重复元素 II](https://leetcode-cn.com/problems/contains-duplicate-ii/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ContainsDuplicateII.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/contains_duplicate_ii.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/contains_duplicate_ii.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/contains_duplicate_ii.cpp) |   简单   |
|    66    |      [加一](https://leetcode-cn.com/problems/plus-one/)      | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/PlusOne.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/plus_one.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/plus_one.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/plus_one.cpp) |   简单   |
|   136    | [只出现一次的数字](https://leetcode-cn.com/problems/single-number/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/SingleNumber.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/single_number.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/single_number.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/single_number.cpp) |   简单   |
|   121    | [买卖股票的最佳时机 I](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/BestTimeBuySellStock.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/best_time_buy_sell_stock.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/best_time_buy_sell_stock.go) |   简单   |
|   122    | [买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/BestTimeBuySellStockII.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/best_time_buy_sell_stock_ii.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/best_time_buy_sell_stock_ii.go) |   简单   |
|    88    | [合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/MergeSortedArray.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/merge_sorted_array.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/merge_sorted_array.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/merge_sorted_array.cpp) |   简单   |
|    26    | [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/RemoveDuplicates.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/remove_deulicates.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/remove_duplicate.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/remove_duplicates.cpp) |   简单   |
|   118    | [杨辉三角](https://leetcode-cn.com/problems/pascals-triangle/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/PascalsTriangle.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/pascals_triangle.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/pascals_triangle.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/pascals_triangle.cpp) |   简单   |
|   169    | [多数元素](https://leetcode-cn.com/problems/majority-element/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/MajorityElement.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/majority_element.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/majority_element.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/majority_element.cpp) |   简单   |
|    15    |      [三数之和](https://leetcode-cn.com/problems/3sum/)      | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ThreeSum.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/three_sum.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/three_sum.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/three_sum.cpp) |   中等   |
|   189    |  [旋转数组](https://leetcode-cn.com/problems/rotate-array/)  | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/RotateArray.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/rotate_array.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/rotata_array.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/rotate_array.cpp) |   中等   |
|    11    | [装水最多的容器](https://leetcode-cn.com/problems/container-with-most-water/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ContainerWithMostWater.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/container_with_most_water.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/container_with_most_water.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/array/container_with_most_water.cpp) |   中等   |
|    48    |  [旋转图像](https://leetcode-cn.com/problems/rotate-image/)  | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/RotateImage.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/rotate_image.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/rotate_image.go) |   中等   |
|   384    | [打乱数组](https://leetcode-cn.com/problems/shuffle-an-array/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ShuffleAnArray.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/shuffle_array.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/shuffle_array.go) |   中等   |
|    36    | [有效的数独](https://leetcode-cn.com/problems/valid-sudoku/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ValidSudoku.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/valid_suduko.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/valid_suduku.go) |   中等   |
|    73    | [矩阵置零](https://leetcode-cn.com/problems/set-matrix-zeroes/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/SetMatrixZeroes.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/set_matrix_zeros.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/set_matrix_zeros.go) |   中等   |
| ———————— |                       ————————————————                       |                        ——————————————                        | ———————— |

## 链表

* 实现一个单链表【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/SingleLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/singly_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/singly_linkedlist/singly_linked_list.go)】
* 实现一个双向链表【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/DoubleLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/doubly_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/doubly_linkedlist/doubly_linkedlist.go)】
* 实现一个循环链表【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/CircleLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/circular_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/circular_linkedlist/circular_linkedlist.go)】
* 常见 Leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   206    | [反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/ReverseLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/reverse_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/reverse_linked_list.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/reverse_list.cpp) |   简单   |
|   160    | [相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/IntersectionLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/intersection_of_two_linked_lists.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/intersection_linked_lists.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/intersection_two_lists.cpp) |   简单   |
|   141    | [环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/LinkedListCycle.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/linked_list_cycle.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/linked_list_cycle.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/linked_list_cycle.cpp) |   简单   |
|   876    | [链表的中间结点](https://leetcode-cn.com/problems/middle-of-the-linked-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/MiddleNode.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/middle_of_the_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/middlen_node.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/middle_node_list.cpp) |   简单   |
|    83    | [删除排序链表中的重复元素](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/RemoveDuplicatesFromSortedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/remove_duplicates_from_sorted_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/remove_duplicates.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/remove_duplicate_sorted_list.cpp) |   简单   |
|    21    | [合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/MergeTwoSortedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/merge_sorted_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/merge_two_sorted_lists.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/mege_sorted_list.cpp) |   简单   |
|   234    | [回文链表](https://leetcode-cn.com/problems/palindrome-linked-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/PalindromeLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/palindrome_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/palindrome_linked_list.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/palindrome_linked_list.cpp) |   简单   |
|   142    | [环形链表II](https://leetcode-cn.com/problems/linked-list-cycle-ii/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/LinkedListCycleII.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/linked_list_cycle_ii.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/linked_list_cycle_ii.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/linked_list_cycle_ii.cpp) |   中等   |
|    19    | [删除链表倒数第 N 个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/RemoveNthNode.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/delete_nth_node.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/remove_nth_node.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/remove_nth_node.cpp) |   中等   |
|    24    | [两两交换链表节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/SwapNodesInPairs.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/swap_nodes_in_pairs.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/swap_node_in_pairs.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/swap_node_pairs.cpp) |   中等   |
|   328    | [奇偶链表](https://leetcode-cn.com/problems/odd-even-linked-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/OddEvenLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/odd_even_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/odd_even_linked_list.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/odd_even_list.cpp) |   中等   |
|    2     | [两数相加](https://leetcode-cn.com/problems/add-two-numbers/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/AddTwoNumbers.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/add_two_numbers.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/add_two_numbers.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/add_two_numbers.cpp) |   中等   |
|   445    | [两数相加ii](https://leetcode-cn.com/problems/add-two-numbers-ii/) | Java、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/add_two_numbers_ii.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/linkedlist/add_two_numbers_ii.cpp) |   中等   |
|   148    |   [排序链表](https://leetcode-cn.com/problems/sort-list/)    |                    Java、Python、Go、C++                     |   中等   |
|          |                      合并 k 个升序链表                       |                                                              |          |
|    25    | [k 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/ReverseNodesKGroup.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/reverse_nodes_in_k_group.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/reverse_nodes_in_k_group.go) |   困难   |
| ———————— |                        ——————————————                        |                       ————————————————                       | ———————— |

## 栈

* 使用数组实现一个栈【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/ArrayStack.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/stack/array_stack.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/array_stack/array_stack.go)】
* 实现链表实现一个栈【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/LinkedStack.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/stack/linked_stack.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/linked_stack/linked_stack.go)】
* 常见 Leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|    20    | [有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/leetcode/ValidParentheses.java)、[Python](https://github.com/roseduan/algo-learn/blob/48d5a3e9fe/python/stack/leetcode/valid_parentheses.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/valid_parentheses.go)、C++ |   简单   |
|   155    |    [最小栈](https://leetcode-cn.com/problems/min-stack/)     | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/leetcode/MinStack.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/stack/leetcode/min_stack.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/min_stack.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/stack/min_stack.cpp) |   简单   |
|   232    | [用栈实现队列](https://leetcode-cn.com/problems/implement-queue-using-stacks/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/leetcode/MyQueue.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/stack/leetcode/queue_use_stack.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/queue_using_stack.go)、[C++](https://github.com/roseduan/algo-learn/blob/master/cpp/stack/queue_use_stack.cpp) |   简单   |
|   496    | [下一个更大元素 I](https://leetcode-cn.com/problems/next-greater-element-i/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/leetcode/NextGreaterElementI.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/stack/leetcode/next_greater_element_i.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/next_greater_element_i.go) |   简单   |
|   856    | [括号的分数](https://leetcode-cn.com/problems/score-of-parentheses/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/stack/leetcode/score_of_parentheses.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/score_of_parentheses.go) |   中等   |
|    84    | [柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/stack/leetcode/LargestRectangleInHistogram.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/largest_rectangle_in_histogram.go) |   困难   |
| ———————— |                       ————————————————                       |                        ——————————————                        | ———————— |

## 队列

* 使用数组实现一个队列【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/ArrayQueue.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/queue/array_queue.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/array_queue/array_queue.go)】
* 使用链表实现一个队列【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/LinkedQueue.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/queue/linked_queue.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/linked_queue/linked_queue.go)】
* 实现一个循环队列【[Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/CycleQueue.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/circular_queue/circular_queue.go)】
* 常见 Leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   225    | [使用队列实现栈](https://leetcode-cn.com/problems/implement-stack-using-queues/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/leetcode/StackUseQueue.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/queue/stack_use_queue.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/leetcode/stack_using_queues.go) |   简单   |
|   641    | [设计循环双端队列](https://leetcode-cn.com/problems/design-circular-deque/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/leetcode/MyCircularDeque.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/leetcode/design_circular_deque.go) |   中等   |
|   622    | [设计循环队列](https://leetcode-cn.com/problems/design-circular-queue/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/CycleQueue.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/leetcode/design_circular_queue.go) |   中等   |
|   239    | [滑动窗口的最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/leetcode/SlidingWindowMaximum.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/queue/sliding_window_maximum.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/leetcode/sliding_window_maximum.go) |   困难   |
| ———————— |                        ——————————————                        |                        ——————————————                        | ———————— |

## 字符串

* 字符串匹配算法：
  * BF 算法【[Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/BruteForce.java)、Python、Go】
  * RK 算法【[Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/RabinKarp.java)、Python、Go】
  * BM 算法【[Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/BM.java)、Python、Go】
  * KMP 算法【[Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/KMP.java)、Python、Go】
* 常见 leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   344    | [反转字符串](https://leetcode-cn.com/problems/reverse-string/) |                       Java、Python、Go                       |   简单   |
|   709    | [转换成小写字母](https://leetcode-cn.com/problems/to-lower-case/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/to_lower_case.py)、Go |   简单   |
|    58    | [最后一个单词的长度](https://leetcode-cn.com/problems/length-of-last-word/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/length_of_ast_word.py)、Go |   简单   |
|   541    | [反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/) |                       Java、Python、Go                       |   简单   |
|    7     | [整数反转](https://leetcode-cn.com/problems/reverse-integer/) |                       Java、Python、Go                       |   简单   |
|   917    | [仅仅反转字母](https://leetcode-cn.com/problems/reverse-only-letters/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/leetcode/ReverseOnlyLetters.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/string/reverse_only_letters.go) |   简单   |
|   205    | [同构字符串](https://leetcode-cn.com/problems/isomorphic-strings/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/leetcode/IsomorphicStrings.java)、Python、Go |   简单   |
|   387    | [字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/first_unique_char.py)、Go |   简单   |
|   125    | [验证回文串](https://leetcode-cn.com/problems/valid-palindrome/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/is_palindrome.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/string/valid_palindrome.go) |   简单   |
|   680    | [验证回文字符串 Ⅱ](https://leetcode-cn.com/problems/valid-palindrome-ii/) | Java、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/string/valid_palindrome_ii.go) |   简单   |
|    28    | [实现 strStr()](https://leetcode-cn.com/problems/implement-strstr/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/implement_strstr.py)、Go |   简单   |
|    14    | [最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/longest_common_prefix.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/string/longest_common_prefix.go) |   简单   |
|    8     | [字符串转换整数](https://leetcode-cn.com/problems/string-to-integer-atoi/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/leetcode/StringToInteger.java)、Python、Go |   中等   |
|   438    | [ 找到字符串中所有字母异位词](https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/) |                       Java、Python、Go                       |   中等   |
|   151    | [翻转字符串里的单词](https://leetcode-cn.com/problems/reverse-words-in-a-string/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/algorithm/string/leetcode/ReverseWordsInString.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/string/reverse_wrod_in_string.py)、Go |   中等   |
|   557    | [反转字符串中的单词 III](https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/) | Java、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/string/reverse_word_in_string_iii.go) |   简单   |
|    38    | [外观数列](https://leetcode-cn.com/problems/count-and-say/)  |                       Java、Python、Go                       |   中等   |
| ———————— |                        ——————————————                        |                       ————————————————                       | ———————— |

## 哈希表

* 实现一个简单的哈希表【Java、Python、Go】
* 用哈希表和双向链表实现一个 Lru Cache【Java、Python、Go】
* 常见 Leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   349    | [求两个数组的交集](https://leetcode-cn.com/problems/intersection-of-two-arrays/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/ArrayIntersection.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/array_intersection.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/array_intersection.go) |   简单   |
|   350    | [求两个数组的交集II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/ArrayIntersectionII.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/array_intersection_ii.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/array_intersection_ii.go) |   简单   |
|   242    | [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/ValidAnagram.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/valid_anagram.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/valida_anagram.go) |   简单   |
|   771    | [宝石与石头](https://leetcode-cn.com/problems/jewels-and-stones/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/jewels_and_stones.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/jewels_and_stones.go) |   简单   |
|    49    | [字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/GroupAnagram.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/group_anagram.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/group_anagram.go) |   中等   |
|   438    | [找到字符串中所有字母异位词](https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/FindAnagrams.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/find_all_anagrams.py)、Go |   中等   |
|   146    | [实现 lru 缓存](https://leetcode-cn.com/problems/lru-cache/#/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/LRUCache.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/lru_cache.go) |   中等   |
|   380    | [常数时间插入、删除和获取随机元素](https://leetcode-cn.com/problems/insert-delete-getrandom-o1/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/RandomizedSet.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/hashtable/leetcode/randomized_set.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/hashtable/leetcode/randomized_set.go) |   中等   |
| ———————— |                       ————————————————                       |                        ——————————————                        | ———————— |

## 布隆过滤器

* 实现一个简单的布隆过滤器【Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/bloomfilter/bloom_filter.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/bloomfilter/bloom_filter.go)】
* 其他优秀的 BloomFilter 实现：
  * [https://github.com/jaybaird/python-bloomfilter 【Python】](https://github.com/jaybaird/python-bloomfilter)
  * [https://github.com/MagnusS/Java-BloomFilter【Java】](https://github.com/MagnusS/Java-BloomFilter)
  * [https://github.com/steakknife/bloomfilter【Golang】](https://github.com/steakknife/bloomfilter)

## 并查集

* 并查集的基本代码模板【Java、Python、Go】

* 常见 leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   547    |  [朋友圈](https://leetcode-cn.com/problems/friend-circles/)  | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/disjointset/leetcode/FriendCircles.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/disjointset/leetcode/friend_circles.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/disjointset/leetcode/friend_circles.go) |   中等   |
|   200    | [岛屿数量](https://leetcode-cn.com/problems/number-of-islands/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/disjointset/leetcode/number_of_islands.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/disjointset/leetcode/number_of_isalands.go) |   中等   |
|   120    | [被围绕的区域](https://leetcode-cn.com/problems/surrounded-regions/) |                       Java、Python、Go                       |   中等   |
| ———————— |                       ————————————————                       |                        ——————————————                        | ———————— |

## 二叉堆

* 实现一个二叉堆【Java、Python、Go】
* 常见 leetcode 练习题

|     题号      |                           题目名称                           |                           解题代码                           |   难度   |
| :-----------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
| 剑指 Offer 40 | [最小的 k 的元素](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/heap/leetcode/MinKthElement.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/heap/min_kth_element.go) |   简单   |
|      703      | [数据流中的第 k 大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/) |                       Java、Python、Go                       |   简单   |
|      347      | [前 k 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/heap/leetcode/TopKFrequentElements.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/heap/topk_frequent_elements.go) |   中等   |
|      215      | [数组中第 k 个最大元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/heap/leetcode/kth_largest_element.py)、Go |   中等   |
|      239      | [滑动窗口的最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/heap/leetcode/SlidingWindow.java)、Python、Go |   困难   |
|   ————————    |                       ————————————————                       |                       ————————————————                       | ———————— |

## 树

### 1. 二叉树

* 实现一个二叉搜索树【Java、Python、Go】
* 常见 leetcode 练习题：

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   144    | [二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | Java、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/tree/leetcode/binary_tree_preorder_traversal.go) |   中等   |
|    94    | [二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/BinaryTreeInorderTraversal.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/binary_tree_inorder_traversal.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/tree/leetcode/binary_tree_inorder_traversal.go) |   中等   |
|   145    | [二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/binary_tree_postorder_traversal.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/tree/leetcode/binary_tree_postorder_traversal.go) |   中等   |
|   102    | [二叉树的层次遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/binary_tree_level_order_traversal.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/tree/leetcode/binary_tree_level_order_traversal.go) |   中等   |
|   107    | [二叉树的层次遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/) |                    Java、Python、Go、C++                     |   简单   |
|   637    | [二叉树的层平均值](https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/) |                       Java、Python、Go                       |   简单   |
|   103    | [二叉树的锯齿形层次遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/ZigZagLevelOrderTraversal.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/binary_tree_zigzag_level_order_traversal.py)、Go |   中等   |
|   199    | [二叉树的右视图](https://leetcode-cn.com/problems/binary-tree-right-side-view/) |                    Java、Python、Go、C++                     |   中等   |
|   104    | [二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/maximum_depth_binary_tree.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/tree/leetcode/maximum_depth_binary_tree.go) |   简单   |
|   559    | [N 叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/) |                    Java、Python、Go、C++                     |   简单   |
|   111    | [二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/minimum_depth_binary_tree.py)、Go |   简单   |
|   662    | [二叉树最大宽度](https://leetcode-cn.com/problems/maximum-width-of-binary-tree/) |                                                              |   中等   |
|   230    | [二叉搜索树中第 K 小元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/kth_smallest_element_bst.py)、Go |   中等   |
|    98    | [验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/valid_bst.py)、Go |   中等   |
|   101    | [对称二叉树](https://leetcode-cn.com/problems/symmetric-tree/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/tree/leetocde/symmetric_tree.py)、Go |   简单   |
|   112    |    [路径总和](https://leetcode-cn.com/problems/path-sum/)    |                    Java、Python、Go、C++                     |   简单   |
|   108    | [有序数组转换为二叉搜索树](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/SortedArrayToBst.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/tree/leetcode/sorted_array_to_bst.go) |   简单   |
|   129    | [求根到叶子节点数字之和](https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/) |                       Java、Python、Go                       |   中等   |
|   116    | [填充每个节点的下一个右侧节点指针](https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/) |                       Java、Python、Go                       |   中等   |
|   105    | [从前序与中序遍历序列构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) |                       Java、Python、Go                       |   中等   |
|   589    | [N叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/NaryTreePreorderTraversal.java)、Python、Go |   简单   |
|   590    | [N叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/NaryTreePostorderTraversal.java)、Python、Go |   简单   |
|   429    | [N叉树的层次遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/NaryTreeLevelOrderTraversal.java)、Python、Go |   中等   |
|   226    | [翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/) |                    Java、Python、Go、C++                     |   简单   |
| ———————— |                        ——————————————                        |                       ————————————————                       | ———————— |

### 2. 字典树

* 实现一个字典树【Java、Python、Go】
* 常见 leetcode 练习题

|   题号   |                           题目名称                           |                           解题代码                           |   难度   |
| :------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|   208    | [实现一个 Trie （字典树）](https://leetcode-cn.com/problems/implement-trie-prefix-tree/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/Trie.java)、Python、Go |   中等   |
|   212    |                          单词搜索II                          | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/tree/leetcode/WordSearchII.java)、Python、Go |   困难   |
| ———————— |                        ——————————————                        |                       ————————————————                       | ———————— |

## 排序和搜索

### 1. 排序

* 冒泡排序【Java、Python、Go】
* 选择排序【Java、Python、Go】
* 插入排序【Java、Python、Go】
* 希尔排序【Java、Python、Go】
* 归并排序【Java、Python、Go】
* 快速排序【Java、Python、Go】
* 堆排序【Java、Python、Go】
* 桶排序【Java、Python、Go】
* 计数排序【Java、Python、Go】
* 基数排序【Java、Python、Go】
* 常见 leetcode 练习题

|   题号   |                           题目名称                           |     解题代码     |   难度   |
| :------: | :----------------------------------------------------------: | :--------------: | :------: |
|          |                           颜色排序                           | Java、Python、Go |   简单   |
|   1122   | [数组的相对排序](https://leetcode-cn.com/problems/relative-sort-array/) | Java、Python、Go |   简单   |
|   242    | [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | Java、Python、Go |   简单   |
|    56    | [合并区间](https://leetcode-cn.com/problems/merge-intervals/) | Java、Python、Go |   中等   |
|   493    |  [翻转对](https://leetcode-cn.com/problems/reverse-pairs/)   | Java、Python、Go |   困难   |
| ———————— |                       ————————————————                       |  ——————————————  | ———————— |

### 2. 二分查找

* 实现二分查找的标准代码模板【Java、Python、Go、C++】
* 常见 leetcode 练习题：

|   题号   |                           题目名称                           |       解题代码        |   难度   |
| :------: | :----------------------------------------------------------: | :-------------------: | :------: |
|   278    | [第一个错误的版本](https://leetcode-cn.com/problems/first-bad-version/) | Java、Python、Go、C++ |   简单   |
|   367    | [有效的完全平方数](https://leetcode-cn.com/problems/valid-perfect-square/) | Java、Python、Go、C++ |   简单   |
|    69    |    [x 的平方根](https://leetcode-cn.com/problems/sqrtx/)     | Java、Python、Go、C++ |   简单   |
|   162    | [寻找峰值](https://leetcode-cn.com/problems/find-peak-element/) | Java、Python、Go、C++ |   中等   |
|    34    | [ 在排序数组中查找元素的第一个和最后一个位置](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Java、Python、Go、C++ |   中等   |
|    33    | [搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/) | Java、Python、Go、C++ |   中等   |
|   153    | [搜索旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/) | Java、Python、Go、C++ |   中等   |
|   540    | [有序数组中的单一元素](https://leetcode-cn.com/problems/single-element-in-a-sorted-array/) | Java、Python、Go、C++ |   中等   |
| ———————— |                       ————————————————                       |   ————————————————    | ———————— |

### 3. 搜索

|   题号   |                           题目名称                           |     解题代码     |   难度   |
| :------: | :----------------------------------------------------------: | :--------------: | :------: |
|   127    |  [单词接龙](https://leetcode-cn.com/problems/word-ladder/)   | Java、Python、Go |   中等   |
|          |                            朋友圈                            |                  |          |
|          |                           岛屿数量                           |                  |          |
|   433    | [最小基因变化](https://leetcode-cn.com/problems/minimum-genetic-mutation/) | Java、Python、Go |   中等   |
| ———————— |                        ——————————————                        | ———————————————— | ———————— |

## 算法思想

### 1. 贪心

|   题号   |    题目名称    |     解题代码     |   难度   |
| :------: | :------------: | :--------------: | :------: |
|          |     分糖果     | Java、Python、Go |   中等   |
|          |    跳跃游戏    | Java、Python、Go |   中等   |
|          |   跳跃游戏II   | Java、Python、Go |   困难   |
| ———————— | —————————————— | ———————————————— | ———————— |

### 2. 回溯

|   题号   |                           题目名称                           |     解题代码     |   难度   |
| :------: | :----------------------------------------------------------: | :--------------: | :------: |
|    79    |                           单词搜索                           | Java、Python、Go |   中等   |
|    22    | [括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | Java、Python、Go |   中等   |
|          |                            全排列                            |                  |          |
|          |                           全排列II                           |                  |          |
|          |                             子集                             |                  |          |
|   547    |  [朋友圈](https://leetcode-cn.com/problems/friend-circles/)  | Java、Python、Go |   中等   |
|          |                            N 皇后                            | Java、Python、Go |   困难   |
|    52    |  [N 皇后 II](https://leetcode-cn.com/problems/n-queens-ii/)  | Java、Python、Go |   困难   |
| ———————— |                        ——————————————                        | ———————————————— | ———————— |

### 3. 分治

|   题号   |                       题目名称                        |     解题代码     |   难度   |
| :------: | :---------------------------------------------------: | :--------------: | :------: |
|    50    | [Pow(x, n)](https://leetcode-cn.com/problems/powx-n/) | Java、Python、Go |   中等   |
| ———————— |                    ——————————————                     | ———————————————— | ———————— |

### 4. 动态规划

|   题号   |                           题目名称                           |     解题代码     |   难度   |
| :------: | :----------------------------------------------------------: | :--------------: | :------: |
|          |                            爬楼梯                            |                  |          |
|   746    | [使用最小花费爬楼梯](https://leetcode-cn.com/problems/min-cost-climbing-stairs/) | Java、Python、Go |   简单   |
|    53    | [最大子序和](https://leetcode-cn.com/problems/maximum-subarray/) | Java、Python、Go |   简单   |
|          |                      三角形的最短路径和                      |                  |          |
|    64    | [最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/) | Java、Python、Go |   中等   |
|    62    |  [不同路径](https://leetcode-cn.com/problems/unique-paths/)  | Java、Python、Go |   中等   |
|    63    | [不同路径II](https://leetcode-cn.com/problems/unique-paths-ii/) | Java、Python、Go |   中等   |
|          |                        乘积最大子数组                        | Java、Python、Go |          |
|   1143   | [最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/) | Java、Python、Go |   中等   |
|   583    | [两个字符串的删除操作](https://leetcode-cn.com/problems/delete-operation-for-two-strings/) | Java、Python、Go |   中等   |
|   300    | [最长上升子序列](https://leetcode-cn.com/problems/longest-increasing-subsequence/) | Java、Python、Go |   中等   |
|          |                          最大正方形                          | Java、Python、Go |          |
|   198    |  [打家劫舍](https://leetcode-cn.com/problems/house-robber/)  | Java、Python、Go |   简单   |
|          |                          打家劫舍II                          | Java、Python、Go |          |
|          |                            按摩师                            | Java、Python、Go |   简单   |
|    91    |  [解码方法](https://leetcode-cn.com/problems/decode-ways/)   | Java、Python、Go |   中等   |
|    72    | [编辑距离](https://leetcode-cn.com/problems/edit-distance/)  | Java、Python、Go |   困难   |
| ———————— |                       ————————————————                       |  ——————————————  | ———————— |

