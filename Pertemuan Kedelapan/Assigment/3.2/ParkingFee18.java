import java.util.Scanner;

public class ParkingFee18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type, duration, total = 0;

        do {
            System.out.print("Enter vehicle type (1 = Car, 2 = Motorcycle, 0 = Exit): ");
            type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter duration (hours): ");
                duration = sc.nextInt();
                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            } else if (type != 0) {
                System.out.println("Invalid vehicle type!");
            }
        } while (type != 0);

        System.out.println("Total parking fees: Rp " + total);
        sc.close();
    }
}