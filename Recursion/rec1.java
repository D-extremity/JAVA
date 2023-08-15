import java.util.Scanner;

public class rec1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        revnum(5);
        in.close();

    }

    static void num(int n) {
        if (n == 0)
            return;
        num(n - 1);
        System.out.println(n);
    }

    static void revnum(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        revnum(--n);

    }

    static void both(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        revnum(n - 1);
        System.out.println(n);

    }
}