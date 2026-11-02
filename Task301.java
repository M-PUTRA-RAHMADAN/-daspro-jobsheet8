import java.util.Scanner;

/**
 * Jobsheet 8 - Assignment 3: Sales Recap for Several Stores
 * Only ordinary accumulator / counter variables are used (no arrays).
 * The per-store summary is built up in a String while the data is entered.
 *
 * Name  : Muhammad Putra Rahmadan
 * NIM   : 264107020001
 * Class : TI-1I
 */
public class Task301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println("The number of stores must be at least 1.");
        } else {
            int grandTotalItems = 0;
            int bestStore = 0;
            int mostItems = -1;          // -1: the first store is always recorded
            String summary = "";

            for (int store = 1; store <= numStores; store++) {
                int numCustomers;
                do {
                    System.out.print("Store " + store + " - number of customers: ");
                    numCustomers = sc.nextInt();
                    if (numCustomers < 0) {
                        System.out.println("  Must not be negative. Retry!");
                    }
                } while (numCustomers < 0);

                int storeItems = 0;
                for (int c = 1; c <= numCustomers; c++) {
                    int items;
                    do {
                        System.out.print("  Items bought by customer " + c + ": ");
                        items = sc.nextInt();
                        if (items < 0) {
                            System.out.println("  Must not be negative. Retry!");
                        }
                    } while (items < 0);
                    storeItems += items;
                }

                summary += "Store " + store + " - customers: " + numCustomers
                        + ", total items: " + storeItems + "\n";
                grandTotalItems += storeItems;

                // '>' (not '>=') keeps the smallest store number when there is a tie
                if (storeItems > mostItems) {
                    mostItems = storeItems;
                    bestStore = store;
                }
            }

            System.out.println();
            System.out.print(summary);
            System.out.println("Total items across all stores: " + grandTotalItems);
            System.out.println("Store with the most items: " + bestStore);
        }
        sc.close();
    }
}
