import java.util.*;

public class PatternQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/*O/P:
8
7
*
**
***
****
*****
******
*******
********

Process finished with exit code 0 /
