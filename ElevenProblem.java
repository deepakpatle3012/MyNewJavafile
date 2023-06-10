import java.util.Scanner;
public class ElevenProblem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
       for ( int i = 0; i < n; i++)
    {
        for ( int j = 0; j < i + 1; j++)
            System.out.print("*");
        System.out.print("\n");
    }
  
    // Loop to print the lower half
    // diamond pattern
    for (int i = 1; i < n; i++)
    {
        for ( int j = i; j < n; j++)
            System.out.print("*");
        System.out.print("\n");
    }
}
  
    }
