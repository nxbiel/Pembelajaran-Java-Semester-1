import java.util.Scanner;

public class Q2CinemaGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day type (weekday/weekend): ");
        String dayType = sc.next().trim().toLowerCase();
        System.out.print("Enter viewer age: ");
        int age = sc.nextInt();

        // Validasi input
        boolean validDay = dayType.equals("weekday") || dayType.equals("weekend");
        if (!validDay || age <= 0) {
            System.out.println("Invalid input! Please check your entries.");
        } else {
            int basePrice;
            int discountPercent = 0;
            int surchargePercent = 0;

            if (dayType.equals("weekday")) {
                basePrice = 40000;
                if (age <= 12) {
                    discountPercent = 50;
                } else if (age >= 60) {
                    discountPercent = 30;
                }
            } else { // weekend
                basePrice = 50000;
                if (age <= 12) {
                    discountPercent = 30;
                } else if (age >= 60) {
                    discountPercent = 10;
                } else if (age >= 18 && age <= 25) {
                    surchargePercent = 5;
                }
            }

            int discount = basePrice * discountPercent / 100;
            int surcharge = basePrice * surchargePercent / 100;
            int finalPrice = basePrice - discount + surcharge;

            System.out.println("Base price: " + basePrice);
            System.out.println("Discount: " + discountPercent + "% (" + discount + ")");
            if (surchargePercent > 0) {
                System.out.println("Surcharge: " + surchargePercent + "% (" + surcharge + ")");
            }
            System.out.println("Final ticket price: " + finalPrice);
        }
    }
}