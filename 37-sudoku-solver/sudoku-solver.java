class Solution {
    public void solveSudoku(char[][] board) {
        boolean ans = solve(board);
        return;
    }
    static boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char c = '1';c<='9';c++){
                        if(isValid(i,j,c,board)){
                            board[i][j]=c;
                            if(solve(board))return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValid(int r, int c, char value, char[][] board){
        for(int i=0;i<9;i++){
            if(board[i][c]==value || board[r][i]==value)return false;
        }
        for(int i=0;i<9;i++){
            if(board[3*(r/3)+i/3][3*(c/3)+i%3]==value) return false;
        }
        return true;
    }
}