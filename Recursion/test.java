// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Sorting.Merge;

public class test extends Merge {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // fact obj=new fact();
        // System.out.println(obj.factorial(5));

        // DigitsSum obj1=new DigitsSum();
        // System.out.println(obj1.sumOfDigits(109909));

        // ReverseNumber ob2=new ReverseNumber();
        // ob2.reverse(123);
        // System.out.println(ob2.sum);

        // SquareRoot obj3=new SquareRoot();
        // System.out.println(obj3.mySqrt(48));


        // isSortedArray obj4=new isSortedArray();
        // System.out.println(obj4.isSorted(new int[]{1,4,3,4,7,8}, 5, 0));


        

        // LinearSearch obj5=new LinearSearch();
        // System.out.println(obj5.search(new int[]{1,2,3,4,5,6,7,12,3,121}, 121, 0));


        // MultipleTarget obj6=new MultipleTarget();
        // // ArrayList<Integer> abc=new ArrayList<>();
        // System.out.println(obj6.multiple(new int[]{1,2,3,4,5,4,12,1}, 4, 0));


        // RecRotated_leet81 obj7=new RecRotated_leet81();
        // System.out.println(obj7.search(new int[]{1,2,1,1,1},2));


        // SelectionSortRecursion obj8=new SelectionSortRecursion();
        // System.out.println(Arrays.toString(obj8.recSelectionSort(new int[]{5,2,8,1,9,4},0)));


        Merge obj9=new Merge();
        System.out.println(Arrays.toString(obj9.merge(new int[]{5,2,8,1,9,4})));

        in.close();
    }
}