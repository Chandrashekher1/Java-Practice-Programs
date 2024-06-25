public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        // placing the queens and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // diagonal left
        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        // diagonal right
        for (int i = 1; row - i >= 0 && col + i < board.length; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
