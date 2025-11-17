public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if(dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;

        int res = 0;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);


        while (dividend >= divisor) {
            dividend -= divisor;
            res++;
        }

        return sign == 1 ? res : -res;
    }
}
