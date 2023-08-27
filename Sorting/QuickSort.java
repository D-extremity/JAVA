package Sorting;

/*
 * Quick Sort is Best efficient way for sorting arrays other than hybrid sorting algorithms
 */
public class QuickSort {
    public void sort(int arr[], int low, int high) {
        if (low >= high)
            return;
        // Low and High remain constant they do not change
        int start = low; // start is used to check if all the elements left tto pivot is lower than pivot
        int end = high;// end checks if all the elemets right to pivot is higher than pivot
        int mid = start + (end - start) / 2;
        int pivotElement = arr[mid];
        /*
         * if arr[s]>pivot (means element left to pivot Element is greater)
         * and arr[e]<pivot (means element right to pivot element is smaller)
         * then swap arr[s] and arr[e]
         */

        /*
         * if start becomes greater than end means :: start comes right to pivot and end
         * comes left to pivot
         * then always swap arr[end] with pivot
         * WHAT ELSE COULD BE DONE??
         * Do a Recusive call of same sorting function outsde the while loop and now we know
         * low is there then e then p is there somewhere then s is there somewhere then
         * at last high is present
         * low->end->pivot->start->high
         * hence, sort(arr,low,end); // for first part of the array
         * sort(arr,start,high); for second part of the array
         */

        while (start <= end) {
            while (arr[start] < pivotElement)
                start++;
            while (arr[end] > pivotElement)
                end--;
            if(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
                /*
                 * start++;
                 * end--;
                 * has been done BECAUSE those elements has been checked and swapped therefore now move forward in array 
                 * TO CHANGE THE PIVOT NOW, BECAUSE PREVIOUS PIVOT IS AT ITS CORRECT PLACE NOW
                 */
            }
        }

        // As soon , start> end , console will come out of the loop 
        sort(arr,low,end);
        sort(arr,start,high);

    }

}
