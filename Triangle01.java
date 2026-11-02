import java.util.Scanner;

/**
 * Jobsheet 8 - Experiment 3: Debugging a Star Triangle (Nested WHILE)
 * Final (fixed) version: prints a triangle and then an inverted triangle.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        // ---- Triangle ----
        int i = 1;                      // fix: start at 1 (not 0) so there is no empty row
        while (i <= n) {
            int j = 0;                  // reset j for every row
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();       // fix: move to a new line after each row
            i++;
        }

        // ---- Inverted triangle ----
        i = n;                          // no "int": i is already declared
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close();
    }
}
