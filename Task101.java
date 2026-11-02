import java.util.Scanner;

/**
 * Jobsheet 8 - Assignment 1: Nested Number Pattern
 * Row i prints the numbers 1 .. i. At the end the total count of printed
 * numbers is displayed.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class Task101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n must be at least 1.");
        } else {
            int totalPrinted = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j > 1) {
                        System.out.print(" ");   // space only between numbers
                    }
                    System.out.print(j);
                    totalPrinted++;
                }
                System.out.println();
            }
            System.out.println("Total numbers printed: " + totalPrinted);
        }
        sc.close();
    }
}
