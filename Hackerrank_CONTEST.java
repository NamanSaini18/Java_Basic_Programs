// There are N students in a classroom and they are seated in a linear order. 
//   The teacher plans to change the seating arrangement of all the students in such a way that each student sits on the new bench everyday.
//   For example, student sitting at first bench moves to the second bench
// Input Format

// An integer N denoting number of students An array arr[n]

// Constraints

// 1

// Output Format

// An array displaying the required seating arrangement

// Sample Input 0

// 6
// James Logan Mason Jacob Lucas Ethan
// Sample Output 0

// Ethan James Logan Mason Jacob Lucas
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] arr = new String[N];
        for(int i = 0;i < N;i++){
            arr[i] = sc.next();
            
        }
        String x = arr[arr.length-1];
        for(int i=N-1;i>0;i--)
        {
            arr[i]  = arr[i-1];
            
        }
        arr[0]  = x;
        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
