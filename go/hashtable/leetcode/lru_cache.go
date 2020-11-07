package leetcode

import "container/list"

//实现Lru缓存

type LRUCache struct {
	m        map[int]*list.Element
	lis      *list.List
	capacity int
}

type Node struct {
	Key, Value int
}

func Constructor(capacity int) LRUCache {
	return LRUCache{
		make(map[int]*list.Element, capacity),
		list.New(),
		capacity,
	}
}

func (this *LRUCache) Get(key int) int {
	if e, ok := this.m[key]; ok {
		this.lis.MoveToFront(e)
		return e.Value.(Node).Value
	}
	return -1
}

func (this *LRUCache) Put(key int, value int) {
	if e, ok := this.m[key]; ok {
		e.Value = Node{key, value}
		this.lis.MoveToFront(e)
	} else {
		if this.lis.Len() == this.capacity {
			last := this.lis.Back()
			this.lis.Remove(last)
			delete(this.m, last.Value.(Node).Key)
		}
		this.m[key] = this.lis.PushFront(Node{key, value})
	}
}
