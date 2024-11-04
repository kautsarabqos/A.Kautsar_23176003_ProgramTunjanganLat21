import java.util.Scanner;

public class ProgramRataRataNilai {

    public static void main(String[] args) {
        // Menjalankan fungsi untuk menghitung rata-rata nilai mahasiswa
        hitungRataRataMahasiswa();
    }

    // Fungsi untuk menghitung rata-rata nilai mahasiswa
    public static void hitungRataRataMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa = 4; // Misalkan banyaknya mahasiswa
        double totalNilai = 0;

        // Mengambil input nilai mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble(); // Membaca nilai
            totalNilai += nilai; // Menambahkan nilai ke total
        }

        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f%n", rataRata);
        System.out.println("Developed by: Rizki Adam Kurniawan");

        scanner.close(); // Menutup scanner
    }
}