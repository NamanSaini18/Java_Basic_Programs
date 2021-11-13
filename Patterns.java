// Below code is for printing a pattern which is Inverted half pyramid and is rotated by 180 deg.
import java.util.*;

public class PatternQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      
       for(int i= 1;i<=a;i++){
           for(int j = 1; j<=a-i;j++){
               System.out.print(" ");
           }
           for(int j = 1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}

// O/P:
// 5
//     *
//    **
//   ***
//  ****
// *****

//
