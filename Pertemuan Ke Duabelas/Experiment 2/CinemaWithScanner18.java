
import java.util.Scanner;

public class CinemaWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, menu;
        String name, choice;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    // Keep asking until the seat is valid and still empty
                    while (true) {
                        System.out.print("Enter row: ");
                        row = sc.nextInt();
                        System.out.print("Enter column: ");
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length) {
                            System.out.println("Warning: row " + row + " does not exist (valid: 1-" + audience.length + "). Try again.");
                        } else if (col < 1 || col > audience[row - 1].length) {
                            System.out.println("Warning: column " + col + " does not exist (valid: 1-" + audience[row - 1].length + "). Try again.");
                        } else if (audience[row - 1][col - 1] != null) {
                            System.out.println("Warning: seat (" + row + "," + col + ") is already taken by "
                                    + audience[row - 1][col - 1] + ". Try again.");
                        } else {
                            break;
                        }
                    }

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    choice = sc.nextLine();

                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\nAudience list:");
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        String seat = (audience[i][j] == null) ? "***" : audience[i][j];
                        System.out.print(seat + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Goodbye.");
                break;
            } else {
                System.out.println("Invalid menu. Choose 1, 2, or 3.");
            }
        }
        sc.close();
    }
}
