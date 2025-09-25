import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> converterDictionary = new HashMap<>() {
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };
        char[] chars = s.toCharArray();
        int output = 0;
        for (int i = 0; i < chars.length; i++) {
            int currentNumber = converterDictionary.get(String.valueOf(chars[i]));
            int nextNumber = 0;

            if (i + 1 < chars.length) {
                nextNumber = converterDictionary.get(String.valueOf(chars[i + 1]));
            }

            if (nextNumber > currentNumber) {
                output += nextNumber - currentNumber;
                i++;
                continue;
            }
            output += currentNumber;
        }
        return output;
    }

}
