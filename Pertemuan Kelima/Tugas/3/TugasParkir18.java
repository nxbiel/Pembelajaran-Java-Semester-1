import java.util.Scanner;


public class TugasParkir18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Parkir Kendaraan Roda Dua ---");
       System.out.print("Masukkan lama parkir (dalam jam): ");
        int lamaParkir = sc.nextInt();
        int totalTarif;

        if (lamaParkir <= 2) {
            // 2 jam pertama dikenai tarif dasar
            totalTarif = 2000;
        } else {
            // lebih dari 2 jam: tarif dasar + Rp1.000 tiap jam berikutnya
            int jamLebih = lamaParkir - 2;
           totalTarif = 2000 + (jamLebih * 1000);
        }

           System.out.println("Lama parkir: " + lamaParkir + " jam");
                 

         System.out.println("Total tarif parkir: Rp " + totalTarif);
        
    }          

}   


