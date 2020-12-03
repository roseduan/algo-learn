
# 解码方法

class Solution:

    def numDecodings(self, s: str) -> int:
        dp = [1] + [0] * len(s)
        if s[0] != '0':
            dp[1] = 1
        
        for i in range(1, len(s)):
            if 0 < int(s[i]) < 10:
                dp[i + 1] += dp[i]
            if 10 <= int(s[i - 1 : i + 1]) <= 26:
                dp[i + 1] += dp[i - 1]
        return dp[-1]
        