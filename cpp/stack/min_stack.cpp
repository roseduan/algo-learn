#include "iostream"
#include "stack"
using namespace std;

class MinStack {
private:
    stack<int> st;
    stack<int> min;
public:
    MinStack() {
        min.push(INT_MAX);
    }

    void push(int val) {
        st.push(val);
        min.push(std::min(min.top(), val));
    }

    void pop() {
        st.pop();
        min.pop();
    }

    int top() {
        return st.top();
    }

    int getMin() {
        return min.top();
    }
};
