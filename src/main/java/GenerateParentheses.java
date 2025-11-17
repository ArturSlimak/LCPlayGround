import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0)
            return result;



        parenthesisGenerator(0,0, n, new StringBuilder(), result);
        return result;
    }

    private void parenthesisGenerator(
            int openCount,
            int closeCount,
            int n,
            StringBuilder currentString,
            List<String> result
    ) {
        if (currentString.length() == n * 2) { //base condition
            result.add(currentString.toString());
            return;
        }

        if(openCount < n) {
            currentString.append("(");
            parenthesisGenerator(openCount+1, closeCount, n, currentString, result);
            currentString.deleteCharAt(currentString.length()-1); //this is the backtracking !!!!!
        }

        if(closeCount<openCount) {
            currentString.append(")");
            parenthesisGenerator(openCount, closeCount+1, n, currentString, result);
            currentString.deleteCharAt(currentString.length()-1);

        }
    }
}
