import java.util.Scanner;

/**
 * Jobsheet 8 - Experiment 2: Rectangle Star Pattern (Nested FOR)
 * The outer loop controls the rows, the inner loop controls the columns.
 * Question 5: the printed character has been changed from * to #.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class Rectangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {            // outer loop: rows
            for (int j = 1; j <= columns; j++) {     // inner loop: columns
                System.out.print("#");
            }
            System.out.println();                    // new line after each row
        }
        sc.close();
    }
}
