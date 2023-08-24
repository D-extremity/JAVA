package ExtraStuff;

import java.util.Arrays;

public class QuickSortHandsOn {
    public static void quickSort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int p = arr[mid];
        while (s <= e) {
            while (arr[s] < p)
                s++;
            while (arr[e] > p)
                e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);

    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        quickSort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}
