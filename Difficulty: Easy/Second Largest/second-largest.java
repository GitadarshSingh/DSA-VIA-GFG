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
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i< n ; i++)
        {
            // if(arr[i] > mx ) mx = arr[i];
            mx = Math.max(arr[i], mx);
            
           
        }
        int secondMx = Integer.MIN_VALUE;
         boolean found = false ;
        for(int i = 0 ; i< n ; i++)
        {
            if(arr[i] > secondMx && arr[i] != mx) 
            {
                secondMx = arr[i];
                found = true ;
            } 
          
        }
        
        if(found){
            return secondMx;
        }
        else return -1;
    }
}