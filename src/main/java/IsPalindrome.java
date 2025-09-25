public class IsPalindrome {

    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public boolean isPalindromeLoop(int x) {
        int original = x;
        int reversed = 0;

        while (x>0) {
            int lastDigit = x%10;
            reversed = reversed*10 + lastDigit;
            x = x/10;
        }
return original==reversed;
}}
