// From the given set of values in the array, the children inside the array is the element which is the smallest among
// all the elements present in the right of it and the rightmost element is always a child.
// If we have 3 elements with same value ie for eg - [3,3,3] then the rightmost will be considered as child.
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class Solution {
            public static void main(String args[] ) throws Exception {
                /* Enter your code here. Read input from STDIN. Print output to STDOUT */
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
                for(int i=0;i<n;i++){
                    int j;
                    for(j=i+1;j<n;j++){
                        if(arr[i] >= arr[j]){
                            break;
                        }
                
                    }
                    if (j==n){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
