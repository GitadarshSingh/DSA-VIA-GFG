import java.util.Arrays;

class Solution {
    public static void rearrange(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        Arrays.sort(arr);

        int start = 0, end = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[end--]; // pick max
            else
                temp[i] = arr[start++]; // pick min
            flag = !flag;
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
