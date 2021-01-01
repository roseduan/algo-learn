package array

import (
	"testing"
)

func TestArray(t *testing.T) {
	arr := New(5)

	t.Run("Put", func(t *testing.T) {
		arr.Add(0, 3)
		arr.Add(3, 2)
		arr.Add(4, 3)

		t.Log(arr.Size())
		arr.PrintData()
	})

	t.Run("Append", func(t *testing.T) {
		arr.Append(3)
		arr.Append(345)
		arr.Append(33)
		arr.Append(5)

		t.Log(arr.Size())
		arr.PrintData()
	})

	t.Run("Remove", func(t *testing.T) {
		arr.Add(0, 3)
		arr.Add(3, 2)
		arr.Add(4, 3)

		arr.Delete(4)
		arr.Delete(0)

		t.Log(arr.Size())
		arr.PrintData()
	})

	t.Run("Contains", func(t *testing.T) {
		arr.Append(12)
		arr.Append(45)
		arr.Append(33)

		t.Log(arr.Contains(33))
		t.Log(arr.Contains(555))
	})
}
