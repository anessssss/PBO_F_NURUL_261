public class Mahasiswa extends user {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String inputNama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNim = input.nextLine();

        if (inputNama.equals(getNama()) && inputNim.equals(getNim())) {
            System.out.println("Login Mahasiswa berhasil!");
            displayInfo();
        } else {
            System.out.println("Login Mahasiswa gagal. Nama atau NIM salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Selamat datang Mahasiswa " + getNama() + ", NIM: " + getNim());
    }
}

