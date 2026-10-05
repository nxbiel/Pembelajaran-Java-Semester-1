package Percobaan;

public import java.util.Scanner;

/
 */
public class FuelcostNabil {

    public static void main(String[] args) {

        // Deklarasi objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double distance;                 
        double fuelConsumptionRate = 2;  
        double fuelPrice = 10000;       
        double fuelNeeded;                
        double totalFuelCost;             

        
        System.out.print("Enter the distance from Malang to Surabaya (km): ");
        distance = input.nextDouble();

        
        fuelNeeded = distance / fuelConsumptionRate;

        
        totalFuelCost = fuelNeeded * fuelPrice;

        // Menampilkan hasil
        System.out.println("\n--- Fuel Cost Details ---");
        System.out.println("Distance          : " + distance + " km");
        System.out.println("Fuel Needed       : " + fuelNeeded + " liters");
        System.out.println("Total Fuel Cost   : Rp " + totalFuelCost);

        // Menutup objek Scanner
        input.close();
    }
} {
    
}
