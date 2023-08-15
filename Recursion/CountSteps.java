// Example 1:

// Input: num = 14
// Output: 6
// Explanation: 
// Step 1) 14 is even; divide by 2 and obtain 7. 
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3. 
// Step 4) 3 is odd; subtract 1 and obtain 2. 
// Step 5) 2 is even; divide by 2 and obtain 1. 
// Step 6) 1 is odd; subtract 1 and obtain 0.
// Example 2:

// Input: num = 8
// Output: 4
// Explanation: 
// Step 1) 8 is even; divide by 2 and obtain 4. 
// Step 2) 4 is even; divide by 2 and obtain 2. 
// Step 3) 2 is even; divide by 2 and obtain 1. 
// Step 4) 1 is odd; subtract 1 and obtain 0.
// Example 3:

// Input: num = 123
// Output: 12

import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(steps(123,0));
        in.close();
    }

    static int steps(int n, int c)
    {
        if(n==0)
            return c;
        else if(n%2==0)
                return steps(n/2,++c);
        return steps(n-1,++c);
    }
}
