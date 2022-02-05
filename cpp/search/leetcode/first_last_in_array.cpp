//  在排序数组中查找元素的第一个和最后一个位置

#include "iostream"
#include "vector"

using namespace std;

class Solution {
public:

    // 线性查找
    vector<int> searchRange1(vector<int>& nums, int target) {
        vector<int> res{-1, -1};
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == target) {
                if (i == 0 || nums[i - 1] != target) {
                    res[0] = i;
                }
                if (i == nums.size() - 1 || nums[i + 1] != target) {
                    res[1] = i;
                }
            }
        }
        return res;
    }

    // 递归查找
    vector<int> searchRange1(vector<int>& nums, int target) {

    }
};
