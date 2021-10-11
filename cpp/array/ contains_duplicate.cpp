#include "vector"
#include "iostream"
#include "unordered_set"

using namespace std;

class Solution {
public:

    // 使用一个set
    bool containsDuplicate1(vector<int>& nums) {
        unordered_set<int> s;
        for (int i : nums) {
            if (s.count(i)) {
                return true;
            }
            s.insert(i);
        }
        return false;
    }

    // 排序
    bool containsDuplicate2(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for (int i = 1; i < nums.size(); ++i) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
};
