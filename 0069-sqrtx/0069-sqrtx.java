class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long left = 2, right = x / 2 + 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long sqr = mid * mid;
            if (sqr == x) {
                return (int) mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}