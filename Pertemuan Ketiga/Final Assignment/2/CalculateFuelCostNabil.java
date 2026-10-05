import java.util.Scanner;

public class CalculateFuelCostNabil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance;
        double fuelNeeded;
        double fuelPricePerLiter = 10000;
        double kmPerLiter = 2;
        double totalFuelCost;

        System.out.print("Enter the distance (km): ");
        distance = input.nextDouble();

        fuelNeeded = distance / kmPerLiter;
        totalFuelCost = fuelNeeded * fuelPricePerLiter;

        System.out.println("\n--- Fuel Cost Details ---");
        System.out.println("Distance         : " + distance + " km");
        System.out.println("Fuel Needed      : " + fuelNeeded + " liters");
        System.out.println("Total Fuel Cost  : Rp " + totalFuelCost);

        input.close();
    }
}