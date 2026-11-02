import java.util.Scanner;

/**
 * Jobsheet 8 - Experiment 1, Question 3:
 * Modification of the "i = 2; i += 2" loop so that it prints the
 * odd positive numbers that do not exceed n.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class StarOdd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        // start at 1 (the first odd number) and step by 2
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
