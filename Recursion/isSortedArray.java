public class isSortedArray {
    public int isSorted(int[] arr,int len,int start)
    {
        if(start==len)
            return 1;
        if(arr[start]>arr[start+1])
            return 0;
        return isSorted(arr, len, start+1);

    }
}
