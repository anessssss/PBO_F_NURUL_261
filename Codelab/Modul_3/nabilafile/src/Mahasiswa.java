 class mahasiswa {
        private String nama;
        private String nim;

        public void Mahasiswa(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }

        public boolean login(String nama, String nim) {
            return this.nama.equals(nama) && this.nim.equals(nim);
        }

        public void displayInfo() {
            System.out.println("Login berhasil! Informasi Mahasiswa:");
            System.out.println("Nama: " + this.nama);
            System.out.println("NIM: " + this.nim);
        }
    }

