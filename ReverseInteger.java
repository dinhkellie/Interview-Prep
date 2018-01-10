// https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        try {
            String y = Integer.toString(x);
            StringBuilder z = new StringBuilder(y).reverse();
            if (x >= 0) {
                return Integer.parseInt(z.toString());
            } else {
                z.deleteCharAt(z.length() - 1);
                z.insert(0, "-");
                return Integer.parseInt(z.toString());
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
