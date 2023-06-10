import java.util.Scanner;
public class EightProblem {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        
        for (int r = 1; r <=num; r++) {
            System.out.print("*");
            for (int s = 1; s <=num-2; s++) {
               System.out.print(" ");}
               System.out.print("*");
            System.out.println();
    }
}}
