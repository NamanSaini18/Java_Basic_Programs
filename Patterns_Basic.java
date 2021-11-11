import java.util.*;

public class Pattern_Questions {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1;i<=n;i++){            //outer loop
          
            for(int j=1;j<=m;j++){        // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// This code will print the simple pattern of a Rectangle according to the input of the rows and columns given by the user.
/*
let n = 4 and m = 5 (Given input by the user)
OUTPUT:
*****
*****
*****
*****

*/

import java.util.*;

public class Pattern_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1;i<=n;i++){                // outer loop
            for(int j=1;j<=m;j++){
                if(i == 1 || j == 1 || i == n || j == m){      // Logic for printing the hollow rectangle.
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// Above code will print the simple pattern for a hollow rectangle according to the input of rows and columns given by the user.
/*
Output will be:
*****
*   *
*   *
*****


*/
