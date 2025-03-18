// Kelas RekeningBank
class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println("---------------------------");
    }

    // Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil setor Rp " + jumlah);
            System.out.println("Saldo baru: Rp " + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
        System.out.println("---------------------------");
    }

    // Method untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik Rp " + jumlah);
            System.out.println("Saldo baru: Rp " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid!");
        }
        System.out.println("---------------------------");
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("202410370110261", "Anis", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110253", "Teman Anis", 300000);

        // Menampilkan informasi rekening sebelum transaksi
        System.out.println("=== Informasi Rekening Sebelum Transaksi ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        System.out.println("=== Transaksi Rekening 1 ===");
        rekening1.setorUang(200000);
        rekening1.tarikUang(150000);

        System.out.println("=== Transaksi Rekening 2 ===");
        rekening2.setorUang(50000);
        rekening2.tarikUang(100000);

        // Menampilkan informasi rekening setelah transaksi
        System.out.println("=== Informasi Rekening Setelah Transaksi ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
