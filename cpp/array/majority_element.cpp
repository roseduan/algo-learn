// 多数元素

#include "vector"
#include "iostream"
#include "unordered_map"

using namespace std;

class Solution {
public:

    // 排序，取最中间的元素
    int majorityElement1(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        return nums[nums.size() / 2];
    }

    // 使用一个哈希表
    int majorityElement2(vector<int>& nums) {
        unordered_map<int, int> m;
        for (int i : nums) {
            m[i] += 1;
            if (m.find(i)->second > nums.size() / 2) {
                return i;
            }
        }
        return nums[0];
    }

    // 摩尔投票法
    int majorityElement3(vector<int>& nums) {
        int count = 1;
        int candidate = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count < 0) {
                    candidate = nums[i];
                    count = 1;                
                }
            }
        }
        return candidate;
    }
};
