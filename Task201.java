import java.util.Scanner;

/**
 * Jobsheet 8 - Assignment 2: Multiplication Table (n x n)
 * Each cell is (row number x column number), right-aligned with printf.
 * The sum of all numbers in the table is displayed at the end.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class Task201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n must be at least 3.");
        } else {
            // column width: at least 4, wider if the largest product needs more digits
            int width = Math.max(4, String.valueOf(n * n).length() + 1);
            long total = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int result = i * j;
                    System.out.printf("%" + width + "d", result);
                    total += result;
                }
                System.out.println();
            }
            System.out.println("Total of all numbers: " + total);
        }
        sc.close();
    }
}
