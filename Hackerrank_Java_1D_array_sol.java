import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      // Below is the code which is written by me
      
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
        a[i] = scan.nextInt();
        } 
      // Above three lines are to be written in this problem.

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
