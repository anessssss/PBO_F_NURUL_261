import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        //data admin
        String username = "Admin261";
        String password = "Password261";

        //data mahasiswa
        String namaMhs = "Nurul Anis Fitriyah";
        String nimMhs = "202410370110261";

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan;
        if (objInput.hasNextInt()){
            pilihan = objInput.nextInt();
            objInput.nextLine();
        }else {
            System.out.println("Pilihan tidak valid");
            objInput.close();
            return;
        }

        if (pilihan == 1){
            while (true){
                System.out.print("Masukkan username: ");
                String inputUsername = objInput.nextLine();
                System.out.print("Masukkan password: ");
                String inputPassword = objInput.nextLine();

                if (inputUsername.equals(username) && inputPassword.equals(password)){
                    System.out.println("Login Admin Berhasil");
                    break;
                }else{
                    System.out.println("Login gagal! username atau password salah");
                }
            }
        }else if (pilihan == 2){
            while (true){
                System.out.print("Masukkan Nama: ");
                String inputNama = objInput.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNim = objInput.nextLine();

                if (inputNama.equals(namaMhs) && inputNim.equals(nimMhs)){
                    System.out.println("Login Mahasiswa Berhasil");
                    System.out.println("Nama: " + inputNama);
                    System.out.println("NIM: "+ inputNim);
                    break;
                }else{
                    System.out.println("Login gagal! nama atau nim salah");
                }
            }
        }else {
            System.out.println("Inputan tidak valid");
        }
        objInput.close();
    }
}