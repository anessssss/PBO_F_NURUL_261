import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("admin261", "password261");
        Mahasiswa mhs = new Mahasiswa("Nurul anis fitriyah", "202410370110261");

        System.out.println("Pilih login sebagai:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilihan (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // clear buffer

        if (pilihan == 1) {
            admin.login();
        } else if (pilihan == 2) {
            mhs.login();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
