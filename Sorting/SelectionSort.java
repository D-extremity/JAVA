package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min_index]>arr[j])
                    min_index=j;
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{5,1,7,2,9,3})));
    }
}
