import java.util.Scanner;

public class Task218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n must be at least 3.");
        } else {
            int total = 0;

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    int result = row * col;
                    System.out.printf("%4d", result);
                    total += result;
                }
                System.out.println();
            }

            System.out.println("Total of all numbers: " + total);
        }
        sc.close();
    }
}