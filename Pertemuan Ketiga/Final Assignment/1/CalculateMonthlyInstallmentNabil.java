import java.util.Scanner;

public class CalculateMonthlyInstallmentNabil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price;
        double downPayment;
        int months;
        double interestRate = 0.01;
        double remainingLoan;
        double interest;
        double totalPayment;
        double monthlyInstallment;

        System.out.print("Enter the motorcycle price (Rp): ");
        price = input.nextDouble();

        System.out.print("Enter the down payment (Rp): ");
        downPayment = input.nextDouble();

        System.out.print("Enter the installment period (months): ");
        months = input.nextInt();

        remainingLoan = price - downPayment;
        interest = remainingLoan * interestRate * months;
        totalPayment = remainingLoan + interest;
        monthlyInstallment = totalPayment / months;

        System.out.println("\n--- Credit Details ---");
        System.out.println("Remaining Loan       : Rp " + remainingLoan);
        System.out.println("Total Interest       : Rp " + interest);
        System.out.println("Total Payment        : Rp " + totalPayment);
        System.out.println("Monthly Installment  : Rp " + monthlyInstallment);

        input.close();
    }
}