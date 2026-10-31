import java.util.Scanner;

public class Task318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStores;
        do {
            System.out.print("Enter the number of stores: ");
            numStores = sc.nextInt();
            if (numStores < 1) {
                System.out.println("The number of stores must be at least 1. Retry!");
            }
        } while (numStores < 1);

        int totalAllItems = 0;
        int maxItems = -1;      // -1 so a store with 0 items can still be recorded
        int bestStore = 0;
        String summary = "";

        for (int store = 1; store <= numStores; store++) {
            System.out.println("Store " + store);

            int numCustomers;
            do {
                System.out.print("  Number of customers: ");
                numCustomers = sc.nextInt();
                if (numCustomers < 0) {
                    System.out.println("  Must not be negative. Retry!");
                }
            } while (numCustomers < 0);

            int storeItems = 0;
            for (int c = 1; c <= numCustomers; c++) {
                int items;
                do {
                    System.out.print("    Items bought by customer " + c + ": ");
                    items = sc.nextInt();
                    if (items < 0) {
                        System.out.println("    Must not be negative. Retry!");
                    }
                } while (items < 0);
                storeItems += items;
            }

            summary += "Store " + store + " - customers: " + numCustomers
                    + ", total items: " + storeItems + "\n";
            totalAllItems += storeItems;

            // strict ">" keeps the smallest store number when there is a tie
            if (storeItems > maxItems) {
                maxItems = storeItems;
                bestStore = store;
            }
        }

        System.out.println();
        System.out.print(summary);
        System.out.println("Total items across all stores: " + totalAllItems);
        System.out.println("Store with the most items: " + bestStore);
        sc.close();
    }
}