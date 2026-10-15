import java.util.Scanner;
public class CinemaGo {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Baca input 
        System.out.print("Enter day type (weekday/weekend): ");
        String dayType = sc.nextLine().trim();
        System.out.print("Enter viewer age: ");
        int age = sc.nextInt();
 
        // Validasi: hari harus weekday/weekend (huruf besar/kecil tidak masalah), umur harus > 0
        boolean isWeekday = dayType.equalsIgnoreCase("weekday");
        boolean isWeekend = dayType.equalsIgnoreCase("weekend");
 
        if ((isWeekday || isWeekend) && age > 0) {
            int basePrice;
            int discountPercent = 0;   
 
            // menentukan jenis hari
            if (isWeekday) {
                basePrice = 40000;
                // kategori umur
                if (age <= 12) {
                    discountPercent = 50;   // tiket untuk anak"
                } else if (age >= 60) {
                    discountPercent = 30;   // tiket untuk lansia
                }
                // umur 13-59: harga normal
            } else {
                basePrice = 50000;
                if (age <= 12) {
                    discountPercent = 30;
                } else if (age >= 60) {
                    discountPercent = 10;
                } else if (age >= 18 && age <= 25) {
                    surchargePercent = 5;   // biaya tambahan usia 18-25
                }
                // umur 13-17 dan 26-59: harga normal
            }
 
            // Hitung nominal diskon, surcharge, dan harga akhir
            int discount = basePrice * discountPercent / 100;
            int surcharge = basePrice * surchargePercent / 100;
            int finalPrice = basePrice - discount + surcharge;
 
            System.out.println("Base price: " + basePrice);
            System.out.println("Discount: " + discountPercent + "% (" + discount + ")");
            if (surchargePercent > 0) {
                System.out.println("Surcharge: " + surchargePercent + "% (" + surcharge + ")");
            }
            System.out.println("Final ticket price: " + finalPrice);
        } else {
            // Input tidak valid
            System.out.println("Invalid input! Please check your entries.");
        }
    }

}
