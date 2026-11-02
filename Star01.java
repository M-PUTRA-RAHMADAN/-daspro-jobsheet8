import java.util.Scanner;

/**
 * Jobsheet 8 - Experiment 1: Review of Loops 1
 * Prints the character * n times side by side using a FOR loop.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class Star01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
