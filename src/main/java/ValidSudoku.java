import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (!Character.isDigit(board[i][j]))
                    continue;


                String rowKey = "Row " + i + " Value: " + board[i][j];
                if(!set.add(rowKey))
                    return false;

                String colKey = "Col " + j + " Value: " + board[i][j];
                if(!set.add(colKey))
                    return false;

                String subBoxKey = "SubBox " + i/3 + " " + j/3 + " Value: " + board[i][j];
                if(!set.add(subBoxKey))
                    return false;
            }
        }
        return true;
    }
}
