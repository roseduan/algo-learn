from typing import List


def guess(data: List[int]):
    for i in range(len(data) - 1):
        for j in range(i + 1, len(data)):
            if data[j] < data[i]:
                data[j], data[i] = data[i], data[j]


if __name__ == "__main__":
    data = [1, 0, 3, 5, 2]
    guess(data)

    # the result is ?
    print(data) 
