package array

import (
	"errors"
	"fmt"
)

//动态数组的实现

const DefaultCapacity = 16
const CapacityThreshold = 1024

type Array struct {
	data     []interface{}
	capacity int
	length   int
}

func New(capacity int) *Array {
	if capacity == 0 {
		return nil
	}

	return &Array{
		make([]interface{}, capacity, capacity),
		capacity,
		0}
}

func Default() *Array {
	return New(DefaultCapacity)
}

//插入元素
func (arr *Array) Add(index int, val interface{}) error {
	err := arr.checkIndex(index)
	if err != nil {
		return err
	}

	//扩容
	if arr.length >= arr.capacity {
		if arr.capacity >= CapacityThreshold {
			arr.resize(int(float64(arr.capacity) * 1.25))
		} else {
			arr.resize(arr.capacity << 1)
		}
	}

	//for i := arr.length; i > index; i-- {
	//	arr.data[i] = arr.data[i - 1]
	//}

	copy(arr.data[index+1:], arr.data[index:])
	arr.data[index] = val
	arr.length++
	return nil
}

//插入至尾部
func (arr *Array) Append(val interface{}) error {
	return arr.Add(arr.length, val)
}

//按照索引查找
func (arr *Array) Find(index int) (interface{}, error) {
	err := arr.checkIndex(index)
	if err != nil {
		return nil, err
	}

	return arr.data[index], nil
}

//删除索引处的值
func (arr *Array) Delete(index int) error {
	err := arr.checkIndex(index + 1)
	if err != nil {
		return err
	}

	arr.data[index] = nil
	copy(arr.data[index:], arr.data[index+1:])

	arr.data[arr.length-1] = nil
	arr.length--
	return nil
}

//打印所有元素值
func (arr *Array) PrintData() {
	for i := 0; i < arr.capacity; i++ {
		if arr.data[i] != nil {
			fmt.Print(arr.data[i], " ")
		}
	}
	fmt.Println()
}

func (arr *Array) resize(newCap int) {
	data := make([]interface{}, newCap, newCap)
	copy(data, arr.data)

	arr.data = data
	arr.capacity = newCap
}

func (arr *Array) checkIndex(index int) error {
	if index < 0 || index > arr.capacity {
		return errors.New("index out of range error")
	}
	return nil
}
