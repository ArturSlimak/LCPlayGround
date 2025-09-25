public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1;

        x = Math.abs(x);
        while (x > 0) {
            int lastDigit = x % 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10))
                return 0;

            reversed = reversed * 10 + lastDigit;
            x = x / 10;


        }
        return reversed * sign;
    }
}
