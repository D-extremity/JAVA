package Sorting;

import java.util.Arrays;

public class Merge {
    public int[] merge(int arr[]) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        // mid is excluded from left array
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeSort(left, right);
    }

    public int[] mergeSort(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        //suppose if any one of those arrays is larger than another in length

        while(i<left.length)
        {
            mix[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length)
        {
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;

    }

}
