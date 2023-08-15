class SquareRoot {
    public int mySqrt(int x) {
        int start = 0, end = x / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == (long) x)
                return mid;
            else if ((long) mid * mid < (long) x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return Math.round(end);
    }
}