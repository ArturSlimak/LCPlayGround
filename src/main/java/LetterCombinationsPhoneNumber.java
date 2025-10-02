import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsPhoneNumber {
    private final Map<Character, List<String>> letterToDigitsMap = new HashMap<>() {{
        put('2', List.of("a", "b", "c"));
        put('3', List.of("d", "e", "f"));
        put('4', List.of("g", "h", "i"));
        put('5', List.of("j", "k", "l"));
        put('6', List.of("m", "n", "o"));
        put('7', List.of("p", "q", "r", "s"));
        put('8', List.of("t", "u", "v"));
        put('9', List.of("w", "x", "y", "z"));

    }};


    //recursion, backtracking
    public List<String> letterCombinationsDFS(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;
        dfsHelper(digits, 0, result, new StringBuilder());

        return result;

    }

    private void dfsHelper(String digits, int index, List<String> result, StringBuilder partialResult) {
        if (index == digits.length()) {
            result.add(partialResult.toString());
            return;
        }

        char currentDigit = digits.charAt(index);
        List<String> letters = letterToDigitsMap.get(currentDigit);

        for (String letter : letters) {
            partialResult.append(letter);
            dfsHelper(digits, index + 1, result, partialResult);
            partialResult.deleteCharAt(partialResult.length() - 1);
        }

    }


    // queue, iterative, layer-by-layer expansion
    public List<String> letterCombinationsBFS(String digits) {
        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        Queue<String> queue = new ArrayDeque<>();
        queue.add("");

        for (char c : digits.toCharArray()) {
            List<String> lettersByCurrentChar = letterToDigitsMap.get(c);
            if (lettersByCurrentChar == null) continue;

            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                String currentChar = queue.poll();
                for (String letter : lettersByCurrentChar) {
                    queue.add(currentChar + letter);
                }
            }

        }

        return new ArrayList<>(queue);
    }
}
