public class Admin extends user {

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usr = input.nextLine();
        System.out.print("Masukkan password: ");
        String pass = input.nextLine();

        if (usr.equals(getNama()) && pass.equals(getNim())) {
            System.out.println("Login Admin berhasil!");
            displayInfo();
        } else {
            System.out.println("Login Admin gagal. Username atau password salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Halo Admin " + getNama() + ", NIM: " + getNim());
    }
}
