public class Donatur {
    private String nama;
    private double jumlahDonasi;

    // Konstruktor berparameter
    public Donatur(String nama, double jumlahDonasi) {
        this.nama = nama;
        this.jumlahDonasi = jumlahDonasi;
    }

    // Getter dan Setter untuk nama donatur
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk jumlah donasi
    public double getJumlahDonasi() {
        return jumlahDonasi;
    }

    public void setJumlahDonasi(double jumlahDonasi) {
        this.jumlahDonasi = jumlahDonasi;
    }

    // Method untuk menampilkan data donatur
    public void tampilkanData() {
        System.out.println("\nNama Donatur : " + nama);
        System.out.println("Jumlah Donasi: Rp " + jumlahDonasi);
    }
}
