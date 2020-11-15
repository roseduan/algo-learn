package leetcode

import (
	"sort"
)

//合并区间

func merge(intervals [][]int) [][]int {
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})

	var res [][]int
	for i := 0; i < len(intervals); i++ {
		if len(res) == 0 || res[len(res)-1][1] < intervals[i][0] {
			res = append(res, intervals[i])
		} else if intervals[i][1] > res[len(res)-1][1] {
			res[len(res)-1][1] = intervals[i][1]
		}
	}
	return res
}
