# algo-learn
学习数据结构与算法的代码示例，目前提供 Java、Python、Go 三种语言支持。编程是一门实践的手艺，多多练习，多多思考，把这里列举的所有算法，数据结构，以及对应的常见 leetcode 习题都自己手敲几遍，增强自己的编码基本功，写出高性能和高质量的代码！

[TOC]

## 数组

* 实现一个动态扩容的数组【Java、Python、Go】

* 常见 leetcode 练习题：

| 题号 |                           题目名称                           |                           解题代码                           |   难度   |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|  1   |    [两数之和](https://leetcode-cn.com/problems/two-sum/)     | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/TwoSum.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/two_sum.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/two_sum.go) |   简单   |
| 283  |   [移动零](https://leetcode-cn.com/problems/move-zeroes/)    | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/MoveZero.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/move_zero.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/move_zero.go) |   简单   |
| 217  | [存在重复元素](https://leetcode-cn.com/problems/contains-duplicate/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ContainsDuplicate.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/contains_duplicate.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/contains_duplicate.go) |   简单   |
| 219  | [存在重复元素 II](https://leetcode-cn.com/problems/contains-duplicate-ii/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/contains_duplicate_ii.py)、Go |   简单   |
|  66  |      [加一](https://leetcode-cn.com/problems/plus-one/)      | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/PlusOne.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/plus_one.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/plus_one.go) |   简单   |
| 136  | [只出现一次的数字](https://leetcode-cn.com/problems/single-number/) |                       Java、Python、Go                       |   简单   |
| 121  | [买卖股票的最佳时机 I](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/BestTimeBuySellStock.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/best_time_buy_sell_stock.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/best_time_buy_sell_stock.go) |   简单   |
| 122  | [买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/BestTimeBuySellStockII.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/best_time_buy_sell_stock_ii.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/best_time_buy_sell_stock_ii.go) |   简单   |
|  88  | [合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/MergeSortedArray.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/merge_sorted_array.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/merge_sorted_array.go) |   简单   |
|  26  | [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/RemoveDuplicates.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/remove_deulicates.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/remove_duplicate.go) |   简单   |
| 118  | [杨辉三角](https://leetcode-cn.com/problems/pascals-triangle/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/pascals_triangle.py)、Go |   简单   |
| 169  | [多数元素](https://leetcode-cn.com/problems/majority-element/) |                       Java、Python、Go                       |   简单   |
|  15  |      [三数之和](https://leetcode-cn.com/problems/3sum/)      | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ThreeSum.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/three_sum.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/three_sum.go) |   中等   |
| 189  |  [旋转数组](https://leetcode-cn.com/problems/rotate-array/)  | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/RotateArray.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/rotate_array.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/rotata_array.go) |   中等   |
|  11  | [装水最多的容器](https://leetcode-cn.com/problems/container-with-most-water/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/ContainerWithMostWater.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/container_with_most_water.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/array/leetcode/container_with_most_water.go) |   中等   |
|  48  |  [旋转图像](https://leetcode-cn.com/problems/rotate-image/)  | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/array/leetcode/RotateImage.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/rotate_image.py)、Go |   中等   |
| 384  | [打乱数组](https://leetcode-cn.com/problems/shuffle-an-array/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/array/leetcode/shuffle_array.py)、Go |   中等   |
|  36  | [有效的数独](https://leetcode-cn.com/problems/valid-sudoku/) |                       Java、Python、Go                       |   中等   |
|  73  | [矩阵置零](https://leetcode-cn.com/problems/set-matrix-zeroes/) |                       Java、Python、Go                       |   中等   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |                         ❤️❤️❤️❤️加油❤️❤️❤️❤️                         | ❤️❤️呀！❤️❤️ |

## 链表

* 实现一个单链表【Java、Python、Go】
* 实现一个双向链表【Java、Python、Go】
* 实现一个循环链表【Java、Python、Go】
* 常见 Leetcode 练习题

| 题号 |                           题目名称                           |                           解题代码                           |   难度   |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
| 206  | [反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/ReverseLinkedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/reverse_linked_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/reverse_linked_list.go) |   简单   |
| 160  | [相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/IntersectionLinkedList.java)、Python、Go |   简单   |
| 141  | [环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/LinkedListCycle.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/linked_list_cycle.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/linked_list_cycle.go) |   简单   |
|  21  | [合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/MergeTwoSortedList.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/merge_sorted_list.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/merge_two_sorted_lists.go) |   简单   |
| 234  | [回文链表](https://leetcode-cn.com/problems/palindrome-linked-list/) |                       Java、Python、Go                       |   简单   |
| 142  | [环形链表II](https://leetcode-cn.com/problems/linked-list-cycle-ii/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/linked_list_cycle_ii.py)、Go |   中等   |
|  19  | [删除链表倒数第 N 个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/RemoveNthNode.java)、[Python](https://github.com/roseduan/algo-learn/blob/master/python/linkedlist/leetcode/delete_nth_node.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/remove_nth_node.go) |   中等   |
|  24  | [两两交换链表节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/SwapNodesInPairs.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/linkedlist/leetcode/swap_node_in_pairs.go) |   中等   |
| 328  | [奇偶链表](https://leetcode-cn.com/problems/odd-even-linked-list/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/linkedlist/leetcode/OddEvenLinkedList.java)、Python、Go |   中等   |
|  2   | [两数相加](https://leetcode-cn.com/problems/add-two-numbers/) |                       Java、Python、Go                       |   中等   |
|  25  | [k 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/) |                       Java、Python、Go                       |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |                         ❤️❤️❤️❤️加油❤️❤️❤️❤️                         | ❤️❤️呀！❤️❤️ |

## 栈

* 使用数组实现一个栈【Java、Python、Go】
* 实现链表实现一个栈【Java、Python、Go】
* 常见 Leetcode 练习题

| 题号 |                           题目名称                           |                           解题代码                           |   难度   |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
|  20  | [有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) | Java、[Python](https://github.com/roseduan/algo-learn/blob/48d5a3e9fe/python/stack/leetcode/valid_parentheses.py)、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/valid_parentheses.go) |   简单   |
| 155  |    [最小栈](https://leetcode-cn.com/problems/min-stack/)     | Java、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/stack/leetcode/min_stack.go) |   简单   |
| 232  | [用栈实现队列](https://leetcode-cn.com/problems/implement-queue-using-stacks/) |                       Java、Python、Go                       |   简单   |
|  84  | [柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/) |                       Java、Python、Go                       |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |                         ❤️❤️❤️❤️加油❤️❤️❤️❤️                         | ❤️❤️呀！❤️❤️ |

## 队列

* 使用数组实现一个队列【Java、Python、Go】
* 使用链表实现一个队列【Java、Python、Go】
* 常见 Leetcode 练习题

| 题号 |                           题目名称                           |                           解题代码                           |   难度   |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
| 225  | [使用队列实现栈](https://leetcode-cn.com/problems/implement-stack-using-queues/) |                       Java、Python、Go                       |   简单   |
| 641  | [设计循环双端队列](https://leetcode-cn.com/problems/design-circular-deque/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/leetcode/MyCircularDeque.java)、Python、Go |   中等   |
| 622  | [设计循环队列](https://leetcode-cn.com/problems/design-circular-queue/) |                       Java、Python、Go                       |   中等   |
| 239  | [滑动窗口的最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/queue/leetcode/SlidingWindowMaximum.java)、Python、[Go](https://github.com/roseduan/algo-learn/blob/master/go/queue/leetcode/sliding_window_maximum.go) |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |                         ❤️❤️❤️❤️加油❤️❤️❤️❤️                         | ❤️❤️呀！❤️❤️ |

## 字符串

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
| 344  | [反转字符串](https://leetcode-cn.com/problems/reverse-string/) | Java、Python、Go |   简单   |
| 541  | [反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/) | Java、Python、Go |   简单   |
|  7   | [整数反转](https://leetcode-cn.com/problems/reverse-integer/) | Java、Python、Go |   简单   |
| 387  | [字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/) | Java、Python、Go |   简单   |
| 125  | [验证回文串](https://leetcode-cn.com/problems/valid-palindrome/) | Java、Python、Go |   简单   |
|  28  | [实现 strStr()](https://leetcode-cn.com/problems/implement-strstr/) | Java、Python、Go |   简单   |
|  8   | [字符串转换整数](https://leetcode-cn.com/problems/string-to-integer-atoi/) | Java、Python、Go |   中等   |
| 438  | [ 找到字符串中所有字母异位词](https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/) | Java、Python、Go |   中等   |
|  38  | [外观数列](https://leetcode-cn.com/problems/count-and-say/)  | Java、Python、Go |   中等   |
|  14  | [最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/) | Java、Python、Go |   简单   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

## 哈希表

* 实现一个基础的哈希表【Java、Python、Go】
* 用哈希表和双向链表实现一个 Lru Cache
* 常见 Leetcode 练习题

| 题号 |                           题目名称                           |                           解题代码                           |   难度   |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------: |
| 349  | [求两个数组的交集](https://leetcode-cn.com/problems/intersection-of-two-arrays/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/ArrayIntersection.java)、Python、Go |   简单   |
| 350  | [求两个数组的交集II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/ArrayIntersectionII.java)、Python、Go |   简单   |
| 242  | [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | [Java](https://github.com/roseduan/algo-learn/blob/master/java/datastructure/hashtable/leetcode/ValidAnagram.java)、Python、Go |   简单   |
|  49  | [字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/) |                       Java、Python、Go                       |   中等   |
| 438  | [找到字符串中所有字母异位词](https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/) |                       Java、Python、Go                       |   中等   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |                         ❤️❤️❤️❤️加油❤️❤️❤️❤️                         | ❤️❤️呀！❤️❤️ |

## 并查集

* 并查集的基本代码模板

* 常见 leetcode 练习题

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
| 547  |  [朋友圈](https://leetcode-cn.com/problems/friend-circles/)  | Java、Python、Go |   中等   |
| 200  | [岛屿数量](https://leetcode-cn.com/problems/number-of-islands/) | Java、Python、Go |   中等   |
| 120  | [被围绕的区域](https://leetcode-cn.com/problems/surrounded-regions/) | Java、Python、Go |   中等   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

## 二叉堆

* 实现一个二叉堆
* 常见 leetcode 练习题

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
|      |                       最小的 k 的个数                        | Java、Python、Go |   中等   |
|      |                       前 k 个高频元素                        | Java、Python、Go |   中等   |
| 215  | [数组中第 k 个最大元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/) | Java、Python、Go |   中等   |
|      |                       滑动窗口的最大值                       | Java、Python、Go |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

## 树

### 1. 二叉树

* 实现一个二叉树
* 常见 leetcode 练习题：

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
|      |                       二叉树的前序遍历                       | Java、Python、Go |          |
|      |                       二叉树的中序遍历                       | Java、Python、Go |          |
|      |                       二叉树的后序遍历                       | Java、Python、Go |          |
|      |                       二叉树的层次遍历                       | Java、Python、Go |          |
|      |                    二叉树的锯齿形层次遍历                    | Java、Python、Go |   中等   |
|      |                       二叉树的最大深度                       | Java、Python、Go |          |
|      |                       二叉树的最小深度                       | Java、Python、Go |          |
|      |                        验证二叉搜索树                        | Java、Python、Go |          |
|      |                          对称二叉树                          | Java、Python、Go |          |
|      |                  将有序数组转换为二叉搜索树                  | Java、Python、Go |   简单   |
|      |                       N叉树的前序遍历                        | Java、Python、Go |          |
|      |                       N叉树的后序遍历                        | Java、Python、Go |          |
|      |                       N叉树的层次遍历                        | Java、Python、Go |          |
| 129  | [求根到叶子节点数字之和](https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/) | Java、Python、Go |   中等   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

### 2. 字典树

* 实现一个字典树
* 常见 leetcode 练习题

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
| 208  | [实现一个 Trie （字典树）](https://leetcode-cn.com/problems/implement-trie-prefix-tree/) | Java、Python、Go |   中等   |
| 212  |                          单词搜索II                          | Java、Python、Go |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

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

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
|      |                           颜色排序                           | Java、Python、Go |   简单   |
| 1122 | [数组的相对排序](https://leetcode-cn.com/problems/relative-sort-array/) | Java、Python、Go |   简单   |
| 242  | [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | Java、Python、Go |   简单   |
|  56  | [合并区间](https://leetcode-cn.com/problems/merge-intervals/) | Java、Python、Go |   中等   |
| 493  |  [翻转对](https://leetcode-cn.com/problems/reverse-pairs/)   | Java、Python、Go |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

### 2. 二分查找

* 实现二分查找的标准代码模板
* 常见 leetcode 练习题：

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
|      |                       第一个错误的版本                       | Java、Python、Go |   简单   |
|      |                       有效的完全平方数                       | Java、Python、Go |   简单   |
|  34  | [ 在排序数组中查找元素的第一个和最后一个位置](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Java、Python、Go |   中等   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

### 3. 搜索

| 题号 |   题目名称   |   解题代码   |   难度   |
| :--: | :----------: | :----------: | :------: |
|      |   单词接龙   |              |          |
|      |    朋友圈    |              |          |
|      |   岛屿数量   |              |          |
|  ❤️   | ❤️❤️❤️❤️少年❤️❤️❤️❤️ | ❤️❤️❤️❤️加油❤️❤️❤️❤️ | ❤️❤️呀！❤️❤️ |

## 算法思想

### 1. 贪心

分糖果

### 2. 回溯

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
|  79  |                           单词搜索                           | Java、Python、Go |   中等   |
|  22  | [括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | Java、Python、Go |   中等   |
|      |                            全排列                            |                  |          |
|      |                           全排列II                           |                  |          |
|      |                             子集                             |                  |          |
| 547  |  [朋友圈](https://leetcode-cn.com/problems/friend-circles/)  | Java、Python、Go |   中等   |
|      |                            N 皇后                            | Java、Python、Go |   困难   |
|  52  |  [N 皇后 II](https://leetcode-cn.com/problems/n-queens-ii/)  | Java、Python、Go |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

### 3. 分治

pow(x, n)

### 4. 动态规划

| 题号 |                           题目名称                           |     解题代码     |   难度   |
| :--: | :----------------------------------------------------------: | :--------------: | :------: |
|  53  | [最大子序和](https://leetcode-cn.com/problems/maximum-subarray/) | Java、Python、Go |   简单   |
|      |                      三角形的最短路径和                      |                  |          |
|  64  | [最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/) | Java、Python、Go |   中等   |
|      |                           不同路径                           | Java、Python、Go |   中等   |
|  63  | [不同路径II](https://leetcode-cn.com/problems/unique-paths-ii/) | Java、Python、Go |   中等   |
|      |                        乘积最大子数组                        | Java、Python、Go |          |
|      |                        最长公共子序列                        | Java、Python、Go |          |
|      |                          最大正方形                          | Java、Python、Go |          |
|      |                           打家劫舍                           | Java、Python、Go |          |
|      |                          打家劫舍II                          | Java、Python、Go |          |
|      |                           编辑距离                           | Java、Python、Go |   困难   |
|  ❤️   |                         ❤️❤️❤️❤️少年❤️❤️❤️❤️                         |   ❤️❤️❤️❤️加油❤️❤️❤️❤️   | ❤️❤️呀！❤️❤️ |

