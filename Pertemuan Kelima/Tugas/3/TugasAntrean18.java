import java.util.Scanner;

public class TugasAntrean18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Mesin Antrean Akademik ---");
        System.out.print("Masukkan kode layanan: ");
        int kode = sc.nextInt();

        
            switch (kode) {
            case 1:
                System.out.println("Layanan: Legalisir Ijazah");
                System.out.println("Silakan menuju Loket A");
                break;
            case 2:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
                System.out.println("Silakan menuju Loket B");
                break;
            case 3:
                System.out.println("Layanan: Pembayaran UKT");
                System.out.println("Silakan menuju Loket C");
                break;
            case 4:
                System.out.println("Layanan: Pengajuan Cuti Akademik");
                System.out.println("Silakan menuju Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
        
    }
    }
