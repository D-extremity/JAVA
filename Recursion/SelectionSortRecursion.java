public class SelectionSortRecursion {
    

    public int[] recSelectionSort(int[] arr,int i) {
        int minimum_index = i;
        if (i == arr.length - 1)
            return arr;
        swap(checkandSwap(arr, minimum_index, i+1, arr.length - 1), i, arr);
       
        return recSelectionSort(arr,i+1);

    }
    

    public int checkandSwap(int arr[], int minimum_index, int j, int len) {
        if (j > len)
            return minimum_index;
        else if (arr[j] < arr[minimum_index])
            minimum_index = j;
        return checkandSwap(arr, minimum_index, j + 1, len);
    }

    public void swap(int minimum_index, int i, int[] arr) {
        int temp = arr[minimum_index];
        arr[minimum_index] = arr[i];
        arr[i] = temp;
    }
    
}
