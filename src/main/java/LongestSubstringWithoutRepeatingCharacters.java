import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mapOfSymbols = new HashMap<>();

        int startIndex = 0;
        int currentIndex = 0;
        int strLength = s.length();
        int theLongestSubstringLength = 0;

        while (startIndex < strLength && currentIndex < strLength) {
            char currentChar = s.charAt(currentIndex);


            if (mapOfSymbols.containsKey(currentChar)) {
                startIndex = currentIndex - mapOfSymbols.size() + 1;
                currentIndex = startIndex;
                mapOfSymbols.clear();
                continue;
            }

            mapOfSymbols.put(currentChar, 1);
            theLongestSubstringLength = Math.max(mapOfSymbols.size(), theLongestSubstringLength);
            currentIndex++;
        }
        return theLongestSubstringLength;
    }
}
