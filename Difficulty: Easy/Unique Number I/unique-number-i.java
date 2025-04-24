//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.findUnique(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findUnique(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
       
        int i = 0;
       while(i < n)
       {
           if(i == n-1 || arr[i] != arr[i+1])
           {
               return arr[i];
               
           }
        i+=2;
       }
       return -1;
        
    }
}