#include "iostream"
#include "vector"

using namespace std;

class BinarySearch {
public:
    // 迭代
    int search(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size() - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // 递归
    int search_recursive(vector<int>& nums, int target) {
        return helper(nums, target, 0, nums.size() - 1);
    }

    int helper(vector<int>& nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if(nums[mid] > target) {
            return helper(nums, target, low, mid - 1);
        }
        if(nums[mid] < target) {
            return helper(nums, target, mid + 1, high);
        }
        return mid;
    }
};
