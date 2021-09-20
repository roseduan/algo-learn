//
// Created by roseduan on 2021/9/18.
//
#include "iostream"
#include "vector"
#include "unordered_map"
using namespace std;

class Solution{

public:
    // 1. 直接遍历
    vector<int> twoSum1(vector<int>& nums, int target) {
        for (int i = 0; i < nums.size() - 1; ++i) {
            for (int j = i + 1; j < nums.size(); ++j) {
                if (nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }
        return {};
    }

    // 1. 使用一个哈希表
    vector<int> twoSum2(vector<int>& nums, int target) {
        unordered_map<int, int> table;
        for (int i = 0; i < nums.size(); ++i) {
            auto it = table.find(target - nums[i]);
            if (it != table.end()) {
                return {it->second, i};
            }
            table[nums[i]] = i;
        }
        return {};
    }
};

int main() {
    cout << "Hello World" << endl;
    Solution sol;
    vector<int> data {1, 5, 3, 9};
    const vector<int> &res = sol.twoSum2(data, 4);
    for (auto i : res) {
        cout << i << endl;
    }
}
