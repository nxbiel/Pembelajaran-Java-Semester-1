import java.util.Scanner;

public class Task1BookstoreDiscountAttendance18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the customer a member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        System.out.print("Total purchase (Rp): ");
        int total = sc.nextInt();

        int discountPercent;
        if (isMember) {
            if (total >= 200000) {
                discountPercent = 20;
            } else if (total >= 100000) {
                discountPercent = 10;
            } else {
                discountPercent = 5;
            }
        } else {
            if (total >= 200000) {
                discountPercent = 10;
            } else if (total >= 100000) {
                discountPercent = 5;
            } else {
                discountPercent = 0;
            }
        }

        double discount = total * discountPercent / 100.0;
        double finalPrice = total - discount;
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Discount amount: Rp" + (long) discount);
        System.out.println("Total to pay: Rp" + (long) finalPrice);
    }
}