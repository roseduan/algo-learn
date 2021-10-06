#include "vector"
#include "iostream"
using namespace std;

class Solution {

public:
    // 移动零
    void moveZeroes1(vector<int>& nums) {
        int i = 0, j = 0;
        for (; j < nums.size(); j++)
        {
            if (nums[j] != 0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }

    // 先将不为零的位置填充，剩下的就是0
    void moveZeroes2(vector<int>& nums) {
        int start = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] != 0) {
                nums[start++] = nums[i];
            }
        }

        for (; start < nums.size(); start++) {
            nums[start] = 0;
        }
    }
};
