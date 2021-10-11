// 盛水最多的容器

#include "vector"
#include "iostream"
#include "unordered_set"

using namespace std;

class Solution {
public:
    // 暴力法，挨个查找并计算面积
    int maxArea1(vector<int>& height) {
        int res = 0;
        for (int i = 0; i < height.size() - 1; i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = (j - i) * min(height[i], height[j]);
                if (h > res) {
                    res = h;
                }
            }
        }
        return res;
    }

    // 双指针法
    int maxArea1(vector<int>& height) {
        int i = 0, j = height.size() - 1;
        int res = 0;
        while (i < j) {
            int v = (j - i) * min(height[i], height[j]);
            if (v > res) {
                res = v;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
};
