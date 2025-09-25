public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty())
            return "";

        String firstStr = strs[0];
        StringBuilder  prefix = new StringBuilder();

        for (int i = 0; i < firstStr.length(); i++) {
            char charAtCurrentIndex = firstStr.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != charAtCurrentIndex) {
                    return prefix.toString();
                }
            }

            prefix.append(charAtCurrentIndex);
        }

        return prefix.toString();
    }
}
