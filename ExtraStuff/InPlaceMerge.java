package ExtraStuff;

//In Place merge sort does not use extra space to create copy of array into two arrays hence it is more reliable and effective
// it is used for linked lst specially because it is stable where as linked list has contiguous memory allocation.
public class InPlaceMerge {
    // Merge sort is based on divide and conquer rule hence first we have to divide
    // the aray into the smallest parts possible.
    // In place Merge sort make changes in original array hence it does not need to
    // return anything.
    public static void divide(int[] arr, int start, int end) // end is length of array-1, passed in main function.
    {
        if (start >= end)
            return;
        int mid = start + (end - end) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        // array has been divided into smallest parts upto here
        // now conquer it ( Merge it while comparing every element)
        conquer(arr, start, mid, end);
    }

    public static void conquer(int arr[], int start, int mid, int end) {
        int firstArrayIndex = start;
        int secondArrayIndex = mid + 1;
        int k = 0;// index of merge array
        int[] mergeArray = new int[end - start + 1];// +1 because array starts from whole number and if+1 is not done
                                                    // then last element will not be allocated

        while (firstArrayIndex <= mid && secondArrayIndex <= end) {
            if (arr[firstArrayIndex] <= arr[secondArrayIndex])
                mergeArray[k++] = arr[firstArrayIndex++];
            else
                mergeArray[k++] = arr[secondArrayIndex++];
        }

        while (firstArrayIndex <= mid)
            mergeArray[k++] = arr[firstArrayIndex++];
        while (secondArrayIndex <= end)
            mergeArray[k++] = arr[secondArrayIndex++];

        for (int i = 0, j = start; i < mergeArray.length; i++, j++) {
            arr[j] = mergeArray[i];
        }

    }

}
