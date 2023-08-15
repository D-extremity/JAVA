public class DigitsSum {
    public int  sumOfDigits(int n)
    {
        if(n==0)
            return n;
        return n%10+sumOfDigits(n/10);
    }
}
