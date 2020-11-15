
# 填充每个节点的下一个右侧节点指针

class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


class Solution:

    # 广度优先
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return root
        queue = [root]
        while len(queue) > 0:
            n = len(queue)
            cur = None
            for _ in range(n):
                node = queue[0]
                if cur:
                    cur.next = node
                cur = node
                queue = queue[1:]
                for child in [node.left, node.right]:
                    if child:
                        queue.append(child)
        return root
