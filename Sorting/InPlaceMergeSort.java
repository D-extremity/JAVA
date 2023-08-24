package Sorting;
/*
 * Go to https://github.com/D-extremity/JAVA/blob/master/ExtraStuff/InPlaceMerge.java For better Explanation
 */
import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {

        int arr[] = { 12,34,754,234,6754,0,13,-23,-3432234,546567,45,443,-9,-9,-34,54};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void divide(int arr[], int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        mergeSort(arr, start, mid, end);
    }

    static void mergeSort(int arr[], int start, int mid, int end) {
        int si = start;// to get first part of sorted array
        int mi = mid + 1;// to get second part of sorted array
        int k = 0;
        int merge[] = new int[end - start + 1];// we can also do arr.length there
        while (si <= mid && mi <= end) {
            if (arr[si] < arr[mi]) {
                merge[k] = arr[si];
                si++;
            } else {
                merge[k] = arr[mi];
                mi++;
            }
            k++;
        }

        while (si <= mid) {
            merge[k] = arr[si];
            k++;
            si++;
        }

        while (mi <= end) {
            merge[k] = arr[mi];
            k++;
            mi++;
        }

        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }
}
