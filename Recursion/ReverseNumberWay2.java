public class ReverseNumberWay2 {
    public static int reversedNum(int n)
    {
        int digits=(int)Math.log10(n)+1;
        return reverseNow(n,digits);
    }
    public static int reverseNow(int n, int len)
    {
        if(n==0)
            return 0;
        int rem=n%10;
        return (int)(rem*(Math.pow(10,len-1)))+reverseNow(n/10,len-1);
    }
    
    public static void main(String[] args) {
            System.out.println(reversedNum(123));
    }
    
}