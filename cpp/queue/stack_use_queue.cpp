// 用队列实现栈

#include "queue"
#include "iostream"
using namespace std;

class MyStack {
private:
    queue<int> que;
public:
    MyStack() {
    }
    
    void push(int x) {
        int size = que.size();
        que.push(x);
        for (int i = 0;i < size; i++) {
            que.push(que.front());
            que.pop();
        }
    }
    
    int pop() {
        int res = que.front();
        que.pop();
        return res;
    }
    
    int top() {
        return que.front();
    }
    
    bool empty() {
        return que.empty();
    }
};

int main() {
    queue<int> q;
    q.push(1);
    q.push(5);
    q.push(2);
    q.push(0);

    while (!q.empty()) {
        cout << q.front() << endl;
        q.pop();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */
