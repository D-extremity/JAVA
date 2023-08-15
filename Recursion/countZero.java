import java.util.Scanner;

public class countZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println(zeroes(2020,0));
        in.close();
    }

    static int zeroes(int n,int c)
    {
        if(n==0)
            return c;
        else if(n%10==0)
            c++;
           return zeroes(n/10,c);
    }
}