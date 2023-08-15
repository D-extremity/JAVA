class RecRotated_leet81 {
    public boolean search(int[] nums, int target) {
        return recRotatedSearch(nums, target, 0, nums.length - 1);

    }

    public boolean recRotatedSearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (end < start)
            return false;
        if (arr[mid] == target)
            return true;
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
}
