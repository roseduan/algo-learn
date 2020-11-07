

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res, m = 0, {}
        for c in s:
            if c in m:
                res = max(res, len(m))
                m.clear()
            m[c] = 1
        return max(res, len(m))


if __name__ == "__main__":
    sol = Solution()
    r = sol.lengthOfLongestSubstring("abcabcbb")
    print(r)
