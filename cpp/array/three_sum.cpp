//
// Created by roseduan on 2021/9/18.
//

#include "iostream"
#include "vector"
using namespace std;

class Solution{
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if (nums.size() < 3) {
            return {};
        }
        std::sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        for (int i = 0; i < nums.size() - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1, k = (int) nums.size() - 1;
            while (j < k) {
                if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                } else if (nums[j] + nums[k] < -nums[i]) {
                    j++;
                } else {
                    res.push_back({nums[i], nums[j], nums[k]});
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return res;
    }
};

// -5 -3 5 6 8

int main() {
    vector<int> data {-1, 0, 1};
    Solution sol;
    const vector<vector<int>> &res = sol.threeSum(data);
    cout << res.size() << endl;
}
