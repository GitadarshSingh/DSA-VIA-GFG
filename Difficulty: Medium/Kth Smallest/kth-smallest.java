class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE; // Track last smallest found
        
        for (int i = 0; i < k; i++) {
            int currMin = Integer.MAX_VALUE;
            
            for (int j = 0; j < n; j++) {
                if (arr[j] > ans && arr[j] < currMin) {
                    currMin = arr[j];
                }
            }
            
            ans = currMin; // Update with next smallest
        }
        
        return ans; // After k iterations, this is the k-th smallest
    }
}
