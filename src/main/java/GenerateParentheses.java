import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        String[] elements = {"(", ")"};
        List<String> result = new ArrayList<>();
        String current = "";
        parenthesisGenerator(elements, n, current, result);
        return result;
    }

    private void parenthesisGenerator(String[] pairs, int amountOfPairs, String current, List<String> result) {
        result.add(current);
        for (int i = 0; i < amountOfPairs; i++) {

        }
    }


}
