import java.util.*;
import java.util.stream.Collectors;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> openClosePairs = new HashMap<>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (openClosePairs.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || openClosePairs.get(stack.pop()) != c)
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
