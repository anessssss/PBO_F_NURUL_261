import java.util.Scanner;

public class Main {
    Admin admin = new Admin("Admin271", "password271");
    Mahasiswa mahasiswa = new Mahasiswa("Nabila Dewinur", "202410370110271");

        System.out.println("Selamat datang di sistem login");
        System.out.println("Pilih jenis login (1. Admin, 2. Mahasiswa): ");
    int pilihan = scanner.nextInt;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Data contoh admin dan mahasiswa();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (Mahasiswa.login(nama, nim)) {
                Mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid! Silakan coba lagi.");
        }

        scanner.close();
    }
}