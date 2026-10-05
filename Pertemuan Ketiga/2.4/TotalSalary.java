import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basicSalary;
        double transportAllowance = 600000, mealAllowance = 400000;
        double bonus, totalSalary;

        System.out.print("Enter the basic salary (Rp): "); 
        basicSalary = sc.nextInt();

        bonus = 0.05 * basicSalary; 

        totalSalary = basicSalary + transportAllowance + mealAllowance 
        +bonus-(0.1* basicSalary); 

        System.out.println("\n--- Salary Details ---"); 
        System.out.println("Basic Salary        : Rp " + basicSalary);
        System.out.println("Transport Allowance : Rp " + transportAllowance);
        System.out.println("Meal Allowance      : Rp " + mealAllowance);
        System.out.println("Bonus               : Rp " + bonus);
        System.out.println("Total Salary        : Rp " + totalSalary);

    }

}
