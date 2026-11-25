import java.util.Scanner;

public class CafeOrder18 {

    // Linear search: returns the index of the menu item, or -1 if it does not exist
    static int findMenu(String[] menu, String name) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(name.trim())) {
                return i;
            }
        }
        return -1;
    }

    // Formats an amount as Rupiah, for example 15000 -> Rp 15.000
    static String rupiah(int amount) {
        return "Rp " + String.format("%,d", amount).replace(',', '.');
    }

    // Reads a whole number of at least 1 and asks again until the input is valid
    static int readPositiveInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(input.nextLine().trim());
                if (value >= 1) {
                    return value;
                }
            } catch (NumberFormatException e) {
                // falls through to the message below
            }
            System.out.println("Please enter a whole number of at least 1.");
        }
    }

    public static void main(String[] args) {
        String[] menu = {"Fried Rice", "Fried Noodles", "Toast", "French Fries", "Pulled Tea", "Cappuccino", "Chocolate Ice"};
        int[] prices = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        Scanner input = new Scanner(System.in);

        // Menu list
        System.out.println("===== CAMPUS CAFE MENU =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s %s%n", i + 1, menu[i], rupiah(prices[i]));
        }

        // Menu search (linear search)
        String again;
        do {
            System.out.print("\nSearch menu name: ");
            String keyword = input.nextLine();
            int found = findMenu(menu, keyword);
            if (found >= 0) {
                System.out.println("\"" + menu[found] + "\" is available. Price: " + rupiah(prices[found]));
            } else {
                System.out.println("Sorry, \"" + keyword.trim() + "\" is not available on the menu.");
            }
            System.out.print("Search another menu? (y/n): ");
            again = input.nextLine().trim();
        } while (again.equalsIgnoreCase("y"));

        // Ordering
        System.out.println();
        int itemCount = readPositiveInt(input, "How many items do you want to order? ");

        String[] orders = new String[itemCount];   // order array, separate from the menu array
        int[] orderPrices = new int[itemCount];
        int total = 0;

        for (int i = 0; i < orders.length; i++) {
            int index = -1;
            while (index < 0) {
                System.out.print("Item #" + (i + 1) + " menu name: ");
                String name = input.nextLine();
                index = findMenu(menu, name);
                if (index < 0) {
                    System.out.println("Menu not found. Please enter a name from the menu list.");
                }
            }
            orders[i] = menu[index];
            orderPrices[i] = prices[index];
            total += prices[index];
        }

        // Order summary and total cost
        System.out.println();
        System.out.println("========== ORDER SUMMARY ==========");
        System.out.printf("%-4s%-18s%12s%n", "No", "Item", "Price");
        System.out.println("-----------------------------------");
        for (int i = 0; i < orders.length; i++) {
            System.out.printf("%-4d%-18s%12s%n", i + 1, orders[i], rupiah(orderPrices[i]));
        }
        System.out.println("-----------------------------------");
        System.out.printf("%-22s%12s%n", "TOTAL (" + orders.length + " items)", rupiah(total));
        System.out.println("===================================");

        input.close();
    }
}
