import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        List<List<Character>> matrix = new ArrayList<>();
        //rows
        for (int i = 0; i < numRows; i++) {
            matrix.add(new ArrayList<>());
        }
        int rowIndex = 0;
        int directionIndicator = -1;
        for (char c : s.toCharArray()) {
            matrix.get(rowIndex).add(c);
            if (rowIndex == 0 || rowIndex == numRows - 1) {
                directionIndicator = -directionIndicator;
            }
            rowIndex += directionIndicator;
        }
        StringBuilder convertedString = new StringBuilder();
        for (List<Character> row : matrix) {
            for (Character c : row) {
                convertedString.append(c);
            }
        }
        return convertedString.toString();
    }
}
