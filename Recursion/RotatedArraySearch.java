
public class RotatedArraySearch {
    static int rotateSearch(int arr[], int target) {
        int start = 0, mid = 0, end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (arr[start] > arr[mid]) {
                if (arr[mid] <= target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else if (arr[start] <= arr[mid]) {
                if (target <= arr[mid] && target >= arr[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(rotateSearch(new int[] { 5, 6, 7, 1, 2, 3,4 }, 4));
    }
}
