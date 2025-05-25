class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int arr[], int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    static int merge(int arr[], int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;      // starting index for left subarray
        int j = mid + 1;   // starting index for right subarray
        int k = 0;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // count inversions
            }
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        // Copy sorted elements back into original array
        for (i = left, k = 0; i <= right; i++, k++)
            arr[i] = temp[k];

        return invCount;
    }
}
