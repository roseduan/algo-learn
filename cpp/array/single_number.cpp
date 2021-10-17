#include "vector"
#include "set"
#include "iostream"
using namespace std;

// 只出现一次的数字

class Solution {

public:
    // 使用一个哈希表
    int singleNumber1(vector<int>& nums) {
        set<int> s;
        for (int i : nums) {
            if (s.count(i)) {
                s.erase(i);
            } else {
                s.insert(i);
            }
        }

        int res = 0;
        for (int i : s) {
            res = i;
        }
        return res;
    }

    // 位运算
    int singleNumber2(vector<int>& nums) {
        int c = 0;
        for (int i : nums) {
            c = c ^ i;
        }
        return c;
    }
};
