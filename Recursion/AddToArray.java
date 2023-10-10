//Testing

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        

            
System.out.println(Arrays.toString(add(new int[]{1,2,3,4,5},5)));


        in.close();
    }

    static int[] add(int[] arr, int len) {
       String s="";
       for(int i=0;i<len;i++)
       {
        s.concat(Integer.toString(arr[i]));
       }
       int n=Integer.parseInt(s);
       n++;
       String ss=Integer.toString(n);
       int[] nn=new int[(int)Math.log10(n)+1];
       for(int i=0;i<(int)Math.log10(n)+1;i++)
       {
        nn[i]=ss.charAt(i);
       }
       return nn;
    }

}