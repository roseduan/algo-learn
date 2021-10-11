#include "iostream"
#include "stack"
#include "unordered_map"

using namespace std;

class Solution {
public:

    // 使用一个栈
    bool isValid1(string s) {
        stack<int> st;
        for (char c : s) {
            if (c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else {
                if (st.empty() || st.top() != c) {
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }

    // 另一种写法
    bool isValid2(string s) {
        unordered_map<char, char> pairs {{')', '('}, {']', '['}, {'}', '{'}};
        stack<int> st;
        for (char c : s) {
            if (pairs.count(c)) {
                if (st.empty() || st.top() != pairs[c]) {
                    return false;
                }
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.empty();
    }
};
