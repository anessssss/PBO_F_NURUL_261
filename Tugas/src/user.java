public class user {
    private String nama;
    private String nim;
//  konstraktor untuk menetepkan nama dan nim saat objek dibuat
    public user(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void login() {
        System.out.println("Login dari user biasa.");
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}
