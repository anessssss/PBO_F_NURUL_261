import java.util.Scanner;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char genderChar = scanner.next().charAt(0);
        String gender;

        if (genderChar == 'L' || genderChar == 'l') {
            gender = "Laki-laki";
        } else if (genderChar == 'P' || genderChar == 'p') {
            gender = "Perempuan";
        } else {
            gender = "Jenis kelamin tidak valid";
        }

        System.out.print("Masukkan tahun lahir: ");
        int birthYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println("Data Diri:");
        System.out.println("Nama: " + name);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur: " + age + " tahun");

        scanner.close();
    }
}
