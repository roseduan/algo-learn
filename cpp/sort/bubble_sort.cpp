//
// Created by roseduan on 2021/9/21.
//
#include "vector"
#include "iostream"
using namespace std;

void BubbleSort(vector<int>& data) {
    for (int i = 0; i < data.size() - 1; ++i) {
        for (int j = i + 1; j < data.size(); ++j) {
            if (data[i] > data[j]) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
    }
}

int main() {
    vector<int> data {6};
    BubbleSort(data);

    for (int i : data) {
        cout << i << endl;
    }
}
