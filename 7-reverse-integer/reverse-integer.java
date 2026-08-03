class Solution {
    public int reverse(int x) {
        int num = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;

            // Check for positive overflow
            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            // Check for negative overflow
            if (num < Integer.MIN_VALUE / 10 ||
                (num == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            num = num * 10 + lastDigit;
        }

        return num;
    }
}