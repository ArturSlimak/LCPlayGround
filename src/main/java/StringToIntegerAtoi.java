public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        s = s.trim();

        int sign = 1, i = 0;
        long result = 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            if (result > Integer.MAX_VALUE && sign == 1)
                return Integer.MAX_VALUE;

            if (result * sign < Integer.MIN_VALUE && sign < 0)
                return Integer.MIN_VALUE;

            i++;
        }


        return (int) result * sign;
    }
}
