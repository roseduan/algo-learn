//
// Created by roseduan on 2021/9/21.
// 归并排序

#include "vector"
#include "iostream"
using namespace std;

void mergeData(vector<int>& data, int p, int q, int r);
void sortHelper(vector<int>& data, int p, int r);

// 归并排序
void MergeSort(vector<int>& data) {
    sortHelper(data, 0, (int)data.size() - 1);
}

void sortHelper(vector<int>& data, int p, int r) {
    if (p >= r) {
        return;
    }
    int q = p + (r - p) / 2;
    sortHelper(data, p, q);
    sortHelper(data, q + 1, r);
    mergeData(data, p, q, r);
}

void mergeData(vector<int>& data, int p, int q, int r) {
    int i = p, j = q + 1;
    vector<int> temp;
    while (i <= q && j <= r) {
        if (data[i] < data[j]) {
            temp.push_back(data[i++]);
        } else {
            temp.push_back(data[j++]);
        }
    }

    int start = i, end = q;
    if (j <= r) {
        start = j;
        end = r;
    }
    for (int k = start; k <= end; ++k) {
        temp.push_back(data[k]);
    }

    // 拷贝回原数组
    for (int k = p; k <= r; ++k) {
        data[k] = temp[k-p];
    }
}

int main() {
    vector<int> data {1, 0, 5, 9, 6, 5, 1, 0, 4, 7, 3};
    MergeSort(data);

    for (int i : data) {
        cout << i << endl;
    }
}
