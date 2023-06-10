import java.util.Scanner;
public class FifthProblem {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for (int r = 1; r <=num; r++) {
            for (int s = 1; s <=num-r; s++) {
               System.out.print(" ");
            }for (int t = 1; t<=r; t++) {
               System.out.print("*");
            }System.out.println();
        }
     }
}
