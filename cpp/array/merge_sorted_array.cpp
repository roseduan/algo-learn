// 合并两个有序数组

#include "vector"
#include "set"
#include "iostream"
#include "cstring"
using namespace std;

class Solution {
public:

    // 第一种方式，直接复制到另一个数组，然后重新排序
    void merge1(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for (int i = m; i < nums1.size(); i++) {
            nums1[i] = nums2[i-m];
        }
        sort(nums1.begin(), nums1.end());
    }

    // 双指针的方式
    void merge2(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int k = nums1.size() - 1;
        while (m >= 1 && n >= 1) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[k] = nums1[m - 1];
                m--;
            } else {
                nums1[k] = nums2[n - 1];
                n--;
            }
            k--;
        }

        for (; n >= 1; n--) {
            nums1[k--] = nums2[n - 1];
        }
    }
};
