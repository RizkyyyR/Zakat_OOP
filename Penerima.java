public class Penerima {
    private String nama;
    private String kebutuhan;

    // Konstruktor berparameter
    public Penerima(String nama, String kebutuhan) {
        this.nama = nama;
        this.kebutuhan = kebutuhan;
    }

    // Getter dan Setter untuk nama penerima
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk kebutuhan penerima
    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    // Method untuk menampilkan data penerima
    public void tampilkanData() {
        System.out.println("\nNama Penerima : " + nama);
        System.out.println("Kebutuhan     : " + kebutuhan);
    }
}
