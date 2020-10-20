
# 不同路径


# 使用分治的思想，递归解决
def unique_path_1(m: int, n: int) -> int:
    def helper(a, b, i, j) -> int:
        if i == a and j == b:
            return 1
        x, y = 0, 0
        if i < a:
            x = helper(a, b, i + 1, j)
        if j < b:
            y = helper(a, b, i, j + 1)
        return x + y

    return helper(m, n, 1, 1)


# 动态规划的思路解决
def unique_path_2(m: int, n: int) -> int:
    # dp = [[1 for _ in range(n)] for _ in range(m)]
    dp = [[1] * n] * m
    for i in range(1, m):
        for j in range(1, n):
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
    return dp[-1][-1]


# 简化一维的写法
def unique_path_3(m: int, n: int) -> int:
    dp = [1] * n
    for i in range(1, m):
        for j in range(1, n):
            dp[j] += dp[j - 1]
    return dp[-1]
