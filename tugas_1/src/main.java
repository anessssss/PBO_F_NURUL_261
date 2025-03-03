import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class DataDiri {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.nextLine().charAt(0);

        // Meminta input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur berdasarkan tahun lahir
        LocalDate tanggalSekarang = LocalDate.now();
        int tahunSekarang = tanggalSekarang.getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan output jenis kelamin berdasarkan input
        String jenisKelaminLengkap;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminLengkap = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminLengkap = "Perempuan";
        } else {
            jenisKelaminLengkap = "Tidak valid";
        }

        // Menampilkan data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Umur        : " + umur + " tahun");

        // Menutup Scanner
        scanner.close();

        System.out.println("Process finished with exit code 0");
    }
}
