#include "vector"
#include "iostream"
#include "unordered_map"

using namespace std;

class Solution {
public:
    // 使用一个哈希表
    bool containsNearbyDuplicate1(vector<int>& nums, int k) {
        unordered_map<int, int> m;
        for (int i = 0; i < nums.size(); ++i) {
            auto it = m.find(nums[i]);
            if (it != m.end() && i - it->second <= k) {
                return true;
            }
            m[nums[i]] = i;
        }
        return false;
    }

    // 暴力法
    bool containsNearbyDuplicate2(vector<int>& nums, int k) {
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i + 1; j <= i + k && j < nums.size(); ++j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
};
