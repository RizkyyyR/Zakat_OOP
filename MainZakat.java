public class MainZakat {
    public static void main(String[] args) {

        Donatur donatur = new Donatur("Rizky", 1000000);
        System.out.println("\nData Donatur Baru");
        donatur.tampilkanData();
        donatur.setNama("Ramadhan");
        donatur.setJumlahDonasi(5000000);
        System.out.println("Nama Donatur : "+donatur.getNama());
        System.out.println("Dana Bantuan : Rp "+donatur.getJumlahDonasi());

        Penerima penerima = new Penerima("Rafatar", "Bantuan biaya sekolah");
        System.out.println("\nData Penerima Baru ");
        penerima.tampilkanData();
        penerima.setNama("Rayanza");
        penerima.setKebutuhan("Biaya Kuliah");
        System.out.println("Penerima  : "+penerima.getNama());
        System.out.println("Kebutuhan : "+penerima.getKebutuhan());

        Yayasan yys = new Yayasan("Peduli Yatim Piatu","Madiun",123456789);
        yys.tampilkanData();
        yys.setnama("Peduli Kasih");
        yys.setalamat("Madiun");
        yys.settlp(1515885103);
        System.out.println("\nNama Yayasan   : "+yys.getnama());
        System.out.println("Alamat Yayasan : "+yys.getalamat());
        System.out.println("Nomor Telepon  : "+yys.gettlp());
    }
}
