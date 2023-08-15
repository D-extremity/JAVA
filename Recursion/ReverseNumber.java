public class ReverseNumber {
   int sum=0;
    public void reverse(int n)
    {
        if(n==0)
            return;
        sum=sum*10+n%10;
        reverse(n/10);
    }
}