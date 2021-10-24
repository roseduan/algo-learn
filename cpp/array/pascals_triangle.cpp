// 杨辉三角

#include "iostream"
#include "vector"

using namespace std;

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res = {
            {1},
        };

        for (int i = 1; i < numRows; i++) {
            vector<int> row(i + 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row[j] = 1;
                } else {
                    row[j] = res[i - 1][j] + res[i - 1][j - 1];
                }
            }
            res.push_back(row);
        }
        return res;
    }
};
