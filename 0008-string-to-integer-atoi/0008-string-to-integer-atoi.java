class Solution {
    public int myAtoi(String s) {
        int index = 0, n = s.length(), sign = 1;
        long result = 0;

        while (index < n && s.charAt(index) == ' ')
            index++;

        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        while (index < n && s.charAt(index) == '0')
            index++;

        while (index < n && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (result * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            index++;
        }

        return (int) (result * sign);
    }
}
