public class RecRotated {
    static int mid = 0;

    public static int recRotatedSearch(int[] arr, int target, int start, int end) {
        mid = start + (end - start) / 2;
        if (end < start)
            return -1;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < arr[start]) {
            if (arr[mid] <= target && target <= arr[end])
                return recRotatedSearch(arr, target, mid + 1, end);
            else
                return recRotatedSearch(arr, target, start, mid - 1);
        }

        else // if(arr[start]<=arr[mid])
        {
            if (target <= arr[mid] && target >= arr[start])
                return recRotatedSearch(arr, target, start, mid - 1);
            else
                return recRotatedSearch(arr, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        System.out.println(recRotatedSearch(new int[] { 1,0,1,1,1}, 1, 0, 4));
    }
}