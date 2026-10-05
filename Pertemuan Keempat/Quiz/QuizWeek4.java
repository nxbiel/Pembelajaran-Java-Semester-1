import java.util.Scanner;

// NAMA : M. Syailendra Nabil Destama
// NIM  : 264107020208
/**
 * A simple program for calculating motorcycle fuel consumption.
 * 
 * I divide the trip into three road conditions: city roads, highways,
 * and mountainous roads. Each condition has a different factor because
 * the fuel usage is not the same on every type of road.
 *
 * Formula used:
 * Fuel consumption = (speed x duration / 100) x engine capacity x environment
 * factor
 *
 * At the end, the program shows the fuel used on each segment, the total fuel,
 * the total distance, the average consumption, and the percentage of the daily
 * target.
 */
public class QuizWeek4 {

    // These values are fixed according to the conditions in the case study.
    static final double ENV_CITY = 0.5;
    static final double ENV_HIGHWAY = 0.3;
    static final double ENV_MOUNTAIN = 0.7;

    public static void main(String[] args) {

        // Scanner reads the values entered by the user.
        Scanner input = new Scanner(System.in);

        // ===== INPUT SECTION =====
        // The speed and duration are entered for each type of road.
        System.out.println("=== City Roads Segment ===");
        System.out.print("Enter speed (km/h): ");
        double citySpeed = input.nextDouble();
        System.out.print("Enter duration (hours): ");
        double cityDuration = input.nextDouble();

        System.out.println("\n=== Highway Segment ===");
        System.out.print("Enter speed (km/h): ");
        double hwSpeed = input.nextDouble();
        System.out.print("Enter duration (hours): ");
        double hwDuration = input.nextDouble();

        System.out.println("\n=== Mountainous Area Segment ===");
        System.out.print("Enter speed (km/h): ");
        double mtSpeed = input.nextDouble();
        System.out.print("Enter duration (hours): ");
        double mtDuration = input.nextDouble();

        // The engine capacity stays the same during the whole trip.
        System.out.print("\nEnter engine capacity (liters/km): ");
        double engineCapacity = input.nextDouble();

        // This target is used to compare the final fuel consumption.
        System.out.print("Enter daily fuel target (liters): ");
        double fuelTarget = input.nextDouble();

        // ===== PROCESS SECTION =====
        // Calculate the fuel consumption for each road condition.
        double cityFuel = (citySpeed * cityDuration / 100) * engineCapacity * ENV_CITY;
        double hwFuel = (hwSpeed * hwDuration / 100) * engineCapacity * ENV_HIGHWAY;
        double mtFuel = (mtSpeed * mtDuration / 100) * engineCapacity * ENV_MOUNTAIN;

        // The total is the sum of the three parts of the trip.
        double totalFuel = cityFuel + hwFuel + mtFuel;

        // Distance is calculated from speed multiplied by duration.
        double cityDistance = citySpeed * cityDuration;
        double hwDistance = hwSpeed * hwDuration;
        double mtDistance = mtSpeed * mtDuration;
        double totalDistance = cityDistance + hwDistance + mtDistance;

        // Average consumption per kilometer is total fuel divided by total distance.
        double avgFuelPerKm = totalFuel / totalDistance;

        // Percentage of the daily target consumed is total fuel divided by target, multiplied by 100.
        double percentageOfTarget = (totalFuel / fuelTarget) * 100;

        // ===== OUTPUT SECTION =====
        System.out.println("\n===================== FINAL RESULTS =====================");
        System.out.printf("City Roads Fuel Consumption      : %.4f liters (distance %.2f km)%n", cityFuel,
                cityDistance);
        System.out.printf("Highway Fuel Consumption          : %.4f liters (distance %.2f km)%n", hwFuel, hwDistance);
        System.out.printf("Mountainous Area Fuel Consumption : %.4f liters (distance %.2f km)%n", mtFuel, mtDistance);
        System.out.println("-----------------------------------------------------");
        System.out.printf("Total Fuel Consumption             : %.4f liters%n", totalFuel);
        System.out.printf("Total Distance                     : %.2f km%n", totalDistance);
        System.out.printf("Average Fuel Consumption per km    : %.4f liters/km%n", avgFuelPerKm);
        System.out.printf("Percentage of Daily Target Consumed: %.2f%%%n", percentageOfTarget);
        System.out.println("=======================================================");

        // Close the Scanner after all input has been read.
        input.close();
    }
}
