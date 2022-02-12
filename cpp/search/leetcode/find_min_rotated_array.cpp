//
// Created by roseduan on 2022/2/12.
//

#include "iostream"
#include "vector"
using namespace std;

// 搜索旋转排序数组中的最小值
class Solution {
public:

    // 直接遍历查找
    int findMin1(vector<int>& nums) {
        int min = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }
        return min;
    }

    // 二分查找
    int findMin2(vector<int>& nums) {
        int low = 0, high = nums.size() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[high];
    }
};
