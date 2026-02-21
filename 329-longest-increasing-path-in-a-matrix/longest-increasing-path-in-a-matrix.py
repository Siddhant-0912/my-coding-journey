from typing import List

class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        if not matrix or not matrix[0]:
            return 0
        
        m, n = len(matrix), len(matrix[0])
        memo = [[0] * n for _ in range(m)]
        
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        
        def dfs(r, c):
            if memo[r][c] != 0:
                return memo[r][c]
            
            max_path = 1
            
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                
                if 0 <= nr < m and 0 <= nc < n and matrix[nr][nc] > matrix[r][c]:
                    length = 1 + dfs(nr, nc)
                    max_path = max(max_path, length)
            
            memo[r][c] = max_path
            return max_path
        
        result = 0
        
        for i in range(m):
            for j in range(n):
                result = max(result, dfs(i, j))
        
        return result