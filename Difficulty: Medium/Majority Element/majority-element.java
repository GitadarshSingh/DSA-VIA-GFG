// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        
        int majority = arr[n/2];
        
        int count = 0;
        for(int ele : arr)
        {
            if(ele  majority) count++;
        }
        if(count>n/2) return majority;
        
        else return -1;==
        
    }
}