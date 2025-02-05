//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class MaxElement {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int ans = arr[0];
        for (int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                ans = arr[i];
            }
        }
        return ans;
    }
}