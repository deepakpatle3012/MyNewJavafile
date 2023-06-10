import java.util.Scanner;
public class SixthProblem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for (int r = 1; r <=num; r++) {
            for (int s = 1; s <=num+1-r; s++) {
               System.out.print(s);
            }
            System.out.println();  
    }
    
}}
