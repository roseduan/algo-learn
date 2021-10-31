#include "vector"
#include "iostream"
#include "unordered_map"

using namespace std;

// 旋转数组

class Solution {
public:

    // 用一个数组暂存
    void rotate1(vector<int>& nums, int k) {
        if (k > nums.size()) {
            k = k % nums.size();
        }
        vector<int> temp;
        for (int i = 0; i < nums.size() - k; i++) {
            temp.push_back(nums[i]);
        }

        int idx = 0;
        for (int i = nums.size() - k; i < nums.size(); i++) {
            nums[idx++] = nums[i];
        }
        for (int i : temp) {
            nums[idx++] = i;
        }
    }

    // 多次翻转
    void rotate2(vector<int>& nums, int k) {
        if (k > nums.size()) {
            k = k % nums.size();
        }
        reverse(nums, 0, nums.size() - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.size() - 1);
    }

    void reverse(vector<int>& nums, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
};
