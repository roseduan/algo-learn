import mmh3
from bitarray import bitarray


# Bloom-Filter 实现


class BloomFilter:

    def __init__(self, size, hash_num):
        self.size = size
        self.hash_num = hash_num
        self.bit_array = bitarray(size)
        self.bit_array.setall(0)

    def add(self, val):
        for seed in range(self.hash_num):
            res = mmh3.hash(val, seed) % self.size
            self.bit_array[res] = 1

    def lookup(self, val):
        for seed in range(self.hash_num):
            res = mmh3.hash(val, seed) % self.size
            if self.bit_array[res] == 0:
                return "None"
        return 'Probably'
