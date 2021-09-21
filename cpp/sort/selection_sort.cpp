//
// Created by roseduan on 2021/9/21.
// 选择排序

#include "vector"
#include "iostream"
using namespace std;

void SelectionSort(vector<int>& data) {
    for (int i = 0; i < data.size() - 1; ++i) {
        int min = i;
        for (int j = i + 1; j < data.size(); ++j) {
            if (data[j] < data[min]) {
                min = j;
            }
        }
        if (min != i) {
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}

int main() {
    vector<int> data {3, 9, 0, 1, 5, 7, 1, 9, 1, 0};
    SelectionSort(data);

    for (int i : data) {
        cout << i << endl;
    }
}
