from typing import List


# 单词接龙

class Solution:

    # 广度优先搜索的思路
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        wordSet = set(wordList)
        if endWord not in wordSet:
            return 0
        
        queue, res = [beginWord], 0
        while len(queue) > 0:
            n = len(queue)
            for i in range(n):
                cur = queue[0]
                queue = queue[1:]
                if cur == endWord:
                    return res + 1
                
                for i in range(len(cur)):
                    for c in range(97, 97 + 26):
                        modStr = cur[:i] + chr(c) + cur[i + 1:]
                        if modStr in wordSet:
                            queue.append(modStr)
                            wordSet.remove(modStr)
            res += 1
        return 0
