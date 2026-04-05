package Recursion.Backtracking;

class WordMaze {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Iterate through every cell in the grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // Optimization: Only trigger DFS if the first letter matches
                if (board[r][c] == word.charAt(0) && dfs(board, r, c, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int r, int c, int index, String word) {
        // Base case: If the index matches the word length, we've found the whole word
        if (index == word.length()) {
            return true;
        }

        // Boundary checks and validation:
        // 1. Row out of bounds
        // 2. Col out of bounds
        // 3. Current cell doesn't match the required character
        if (r < 0 || r >= board.length ||
                c < 0 || c >= board[0].length ||
                board[r][c] != word.charAt(index)) {
            return false;
        }

        // Temporarily mark the current cell as visited to prevent reusing it
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore all 4 adjacent directions (down, up, right, left)
        boolean found = dfs(board, r + 1, c, index + 1, word) ||
                dfs(board, r - 1, c, index + 1, word) ||
                dfs(board, r, c + 1, index + 1, word) ||
                dfs(board, r, c - 1, index + 1, word);

        // Backtrack: Restore the cell's original character for other paths to use
        board[r][c] = temp;

        return found;
    }
}
