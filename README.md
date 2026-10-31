<div align="center">

# ☕ Pembelajaran Java: Semester 1

**Dari `Hello World` sampai nested loop dalam 9 pertemuan.**

![Java](https://img.shields.io/badge/Java-21%2B-ED8B00?logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/Editor-VS%20Code-007ACC?logo=visualstudiocode&logoColor=white)
![Kampus](https://img.shields.io/badge/Polinema-TI--1I-1F6FEB)
![Pertemuan](https://img.shields.io/badge/Pertemuan-9-2EA043)

</div>

---

## Isi Repo

| 42 | 4 | 19 | 9 |
| :---: | :---: | :---: | :---: |
| program Java | laporan praktikum | tangkapan layar | pertemuan |

Semua kode lahir di kelas Dasar Pemrograman, Politeknik Negeri Malang, bersama Pak Imam. Tiap pertemuan punya jobsheet, percobaan, dan tugas. Pertemuan Keenam, Kedelapan, dan Kesembilan punya laporan lengkap dengan kode, hasil, dan analisis.

## Lihat Hasilnya

Pertemuan Kesembilan menggambar pola dengan nested loop. `Triangle18` menerima angka `n`, lalu mencetak segitiga naik dan turun. Input `5` menghasilkan ini:

```
Enter the value of n = 5
*
**
***
****
*****
*****
****
***
**
*
```

Tangkapan layar dari terminal saat program berjalan:

<div align="center">

![Hasil Triangle18](Pertemuan%20Kesembilan/img/triangle18.png)

</div>

`Rectangle18` mencetak persegi panjang `#` dari jumlah baris dan kolom. Input `4` baris dan `6` kolom:

```
######
######
######
######
```

## Peta Belajar

| # | Topik | Yang dibuat |
| :---: | --- | --- |
| 1 | 👋 [Program pertama](Pertemuan%20Pertama) | `Latihan00` dan `MyFirstJava18` mencetak teks ke layar |
| 2 | 📦 [Variabel, tipe data, operator](Pertemuan%20Kedua) | Tugas 2.1 sampai 2.5, termasuk luas segitiga dan hitungan tabungan bank |
| 3 | ➕ [Operator dan perhitungan](Pertemuan%20Ketiga) | Luas persegi panjang, total pembayaran, total gaji, cicilan bulanan, biaya BBM |
| 4 | 📝 [Quiz](Pertemuan%20Keempat/Quiz) | `QuizWeek4` menghitung konsumsi BBM motor di jalan kota, jalan raya, dan jalan pegunungan |
| 5 | 🔀 [Seleksi: `if`, `if-else`, `switch`](Pertemuan%20Kelima) | Cetak KRS, validasi SKS, mesin antrean akademik, tarif parkir |
| 6 | 🧩 [Nested `if` dan operator logika](Pertemuan%20Keenam) | Syarat ujian skripsi, absensi WiFi, akses lab, diskon toko buku. Laporan dalam [Indonesia](Pertemuan%20Keenam/Jobsheet6_report_attendance18_ID.md) dan [Inggris](Pertemuan%20Keenam/Jobsheet6_report_attendance18_EN.md) |
| 7 | 🎬 [Ujian tengah semester](Pertemuan%20Ke%20Tujuh) | `CinemaGo` untuk harga tiket bioskop dan proyek Arduino buzzer |
| 8 | 🔁 [Perulangan 1: `for`, `while`, `do-while`](Pertemuan%20Kedelapan) | Nilai mahasiswa SIAKAD, pesanan kafe, tiket bioskop, biaya parkir. [Laporan](Pertemuan%20Kedelapan/Assigment%20Report/Report%20Jobsheet7%2018.md) |
| 9 | 🪆 [Perulangan 2: nested loop](Pertemuan%20Kesembilan) | Bintang, persegi panjang, segitiga, nilai kelompok, 3 tugas. [Laporan](Pertemuan%20Kesembilan/Assigment%20Report/Jobsheet%208%20report.md) |

Nomor jobsheet berbeda dari nomor pertemuan. Jobsheet 7 jatuh di Pertemuan 8, dan Jobsheet 8 di Pertemuan 9.

## Konsep yang Muncul di Kode

- [x] Variabel dan tipe data
- [x] Operator aritmetika, relasional, dan logika (`&&`, `||`, `!`)
- [x] Input keyboard dengan `Scanner`
- [x] Seleksi dengan `if`, `if-else`, dan `switch`
- [x] Nested `if`
- [x] Perulangan `for`, `while`, dan `do-while`
- [x] Nested loop

## Jalankan Sendiri

Kamu butuh JDK 21 atau lebih baru. JDK 25 adalah versi LTS terbaru. Cek instalasi:

```bash
java -version
javac -version
```

<details>
<summary><b>Compile lalu jalankan</b></summary>

```bash
cd "Pertemuan Kesembilan/2.1 Experiment 1"
javac Star18.java
java Star18
```

</details>

<details>
<summary><b>Jalankan langsung dari source</b></summary>

JDK 11 ke atas menjalankan satu file `.java` tanpa langkah compile terpisah dan tanpa file `.class`:

```bash
java Star18.java
```

</details>

<details>
<summary><b>Pakai VS Code</b></summary>

Pasang Extension Pack for Java, buka folder repo, lalu klik **Run** di atas method `main`.

</details>

Hampir semua program meminta input lewat `Scanner`, jadi ketik jawabanmu di terminal setelah program mulai.

## Struktur Folder

```
Pembelajaran-Java-Semester-1/
├── Pertemuan Pertama/
├── Pertemuan Kedua/          # Tugas 2.1 - 2.5
├── Pertemuan Ketiga/         # percobaan 2.1 - 2.4 + Final Assignment
├── Pertemuan Keempat/Quiz/
├── Pertemuan Kelima/         # percobaan 2.1 - 2.3 + Tugas 1 - 3
├── Pertemuan Keenam/         # percobaan, Task, laporan, images
├── Pertemuan Ke Tujuh/       # Mid Exam
├── Pertemuan Kedelapan/      # percobaan, Assigment, laporan, images
└── Pertemuan Kesembilan/     # Experiment 1 - 4, Assigment 1 - 3, laporan, img
```

Setiap percobaan atau tugas punya subfolder sendiri dengan satu file `.java`. Folder `images` dan `img` menyimpan tangkapan layar untuk laporan.

## Aturan Penamaan

- Nama file sama dengan nama `public class` di dalamnya. `Star18.java` berisi `public class Star18`.
- Akhiran `18` di banyak nama kelas adalah nomor presensi penulis.
- Program di Pertemuan Ketiga memakai akhiran `Nabil`.

## Catatan Akademik

Repo ini menyimpan pekerjaan belajar pribadi. Baca sebagai referensi, kerjakan tugasmu sendiri, dan ikuti aturan dosen pengampu.

## Penulis

**M. Syailendra Nabil Destama** · [@nxbiel](https://github.com/nxbiel)
