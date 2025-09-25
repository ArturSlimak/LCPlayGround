public class FindTheIndexFirstOccurrenceString {
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        int haystackIndex = 0;
        int needleIndex = 0;

        while (haystackIndex < haystackLen) {

            if (haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                haystackIndex++;
                needleIndex++;

                if (needleIndex == needleLen)
                    return haystackIndex - needleLen;
            } else {
                haystackIndex = haystackIndex - needleIndex + 1;
                needleIndex = 0;
            }
        }
        return -1;

    }
}
