package ExtraStuff;

import java.util.Arrays;

public class Quick {
    public static void quick(int arr[], int low, int high) {
        if (low >= high)
            return;
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick(arr, low, end);
        quick(arr, start, high);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 5, 65, 6, 8, 234, 546, 34, 45, 56, 345, 346, 456, 345, 234, 214, 25, 546, 466, 46, 243, 235,
                56, 567, 78, 789, 534, 234, 234, 2345, 345, 214, 345, 76, 8, 34, 2, 435, 5456, 546, 35, 547, 567, 23,
                456, 56, 546, 546, 3 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
