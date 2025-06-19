class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        solve(0, n, new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int row, int n, List<String> curr, List<List<String>> ans) {
        if (row == n) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, curr, n)) {
                char[] rowArr = new char[n];
                Arrays.fill(rowArr, '.');
                rowArr[col] = 'Q';
                curr.add(new String(rowArr));
                solve(row + 1, n, curr, ans);
                curr.remove(curr.size() - 1); 
            }
        }
    }
    public boolean isSafe(int row, int col, List<String> board, int n) {
        for (int i = 0; i < row; i++) {
            int qCol = board.get(i).indexOf('Q');
            if (qCol == col || Math.abs(i - row) == Math.abs(qCol - col)) {
                return false;
            }
        }
        return true;
    }
}
