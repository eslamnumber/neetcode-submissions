class Solution {
      @SuppressWarnings("unchecked")
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[][] sqr =
                (HashSet<Character>[][]) new HashSet<?>[3][3];

        HashSet<Character>[] rows =
                (HashSet<Character>[]) new HashSet<?>[9];

        HashSet<Character>[] cols =
                (HashSet<Character>[]) new HashSet<?>[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sqr[i][j] = new HashSet<>();
            }
        }

        for(int i =0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                if(board[i][j]=='.')
                    continue;

                if((sqr[i/3][j/3]).contains(board[i][j]))
                    return false;

                if(rows[i].contains(board[i][j]))
                    return false;

                if(cols[j].contains(board[i][j]))
                    return false;

                sqr[i/3][j/3].add(board[i][j]);
                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);


            }
        }
        return true;
    }

}
