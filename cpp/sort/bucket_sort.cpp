#include "iostream"
#include "iomanip"
using namespace std;

#define NARRAY 7
#define NBUCKET 6
#define INTERVAL 10

struct Node
{
    int data;
    struct Node *next;
};


void BucketSort(int arr[]);
struct Node *InsertionSort(struct Node *list);
void print(int arr[]);
void printBuckets(struct Node *list);
int getBucketIndex(int value);

// 排序方法
void BucketSort(int arr[])
{
    int i, j;
    struct Node **buckets;

    // 创建桶并分配内存
    buckets = (struct Node **)malloc(sizeof(struct Node *) * NBUCKET);

}

int main() 
{
    std::cout << "Hello World" << std::endl;
}
