import java.util.Scanner;

public class Quiz218 {
    public static void main(String[] args) {
        String nama = "Nabil";
        int noAbsen = 18;
        int k = noAbsen % 5;                               // % itu sisa bagi, 18 : 5 sisa 3, maka k = 3
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);

        Scanner sc = new Scanner(System.in);               // baca input dari keyboard
        System.out.print("Jumlah tim   : ");
        int jumlahTim = sc.nextInt();
        System.out.print("Jumlah ronde : ");
        int jumlahRonde = sc.nextInt();

        int batasUnggulan = 20 + k;                        // batas unggulan = 20 + 3 = 23
        double rataTertinggi = 0.0;                        // rekor rata-rata, awalnya 0
        int timTerbaik = 0;                                // nomor tim juara, 0 = belum ada
        int jumlahUnggulan = 0;                            // menghitung jumlah tim unggulan

        // inner loop dijalankan 4 kali seperti contoh di ilustrasi yang pak imam berikan di lms (2 tim x 2 ronde)
        for (int tim = 1; tim <= jumlahTim; tim++) {       // loop luar: mengurus satu tim per putaran
            System.out.println("Tim " + tim);
            int total = 0;                                 // di dalam loop biar reset tiap ganti tim
            int dimainkan = 0;                             // jumlah ronde yang beneran dimainin

            for (int ronde = 1; ronde <= jumlahRonde; ronde++) {   // loop dalam: mengurus tiap ronde
                System.out.print("  Skor ronde " + ronde + ": ");
                int skor = sc.nextInt();
                if (skor != 0) {                           // skor 0 = tim tidak main, jadi tidak dihitung
                    total = total + skor;
                    dimainkan++;
                }
            }

            double rata = 0;
            if (dimainkan > 0) {                           // dicek dulu biar tidak dibagi 0
                rata = (double) total / dimainkan;         // (double) biar hasil nya ada komanya, 47/2 = 23.5
            }

            String kategori;
            if (dimainkan == 0) {                          // tidak pernah main
                kategori = "Gugur";
            } else if (rata >= batasUnggulan) {            // rata" 23 ke atas
                kategori = "Unggulan";
                jumlahUnggulan++;
            } else {
                kategori = "Reguler";
            }

            System.out.printf("  Main: %d | Rata: %.2f | %s%n", dimainkan, rata, kategori);
            // %d buat bilangan bulat, %.2f buat desimal 2 angka, %s buat teks, %n buat enter

            if (timTerbaik == 0 || rata > rataTertinggi) { // tim pertama otomatis menjadi juara, setelah itu harus lebih besar dari rekor
                rataTertinggi = rata;
                timTerbaik = tim;
            }
        }
        System.out.println("==============================");
        System.out.println("Tim terbaik         : " + timTerbaik);
        System.out.printf("Rata-rata tertinggi : %.2f%n", rataTertinggi);
        System.out.println("Jumlah tim Unggulan : " + jumlahUnggulan);
    }
}