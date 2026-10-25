import java.util.Scanner;

public class CinemaTickets18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TICKET_PRICE = 50000;
        int tickets;
        int totalTickets = 0;
        double totalRevenue = 0;

        System.out.println("Enter the number of tickets for each customer (0 to finish).");

        do {
            System.out.print("Number of tickets: ");
            tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Invalid quantity. Please enter a valid number!");
                continue; // jumps to the do-while condition, then asks again
            }

            if (tickets == 0) {
                break;
            }

            double price = tickets * TICKET_PRICE;
            double discount = 0;
            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            }
            double payment = price - (price * discount);

            System.out.println("Discount: " + (int) (discount * 100) + "%");
            System.out.println("Amount to pay: Rp " + (long) payment);

            totalTickets += tickets;
            totalRevenue += payment;
        } while (true);

        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total ticket sales: Rp " + (long) totalRevenue);
        sc.close();
    }
}