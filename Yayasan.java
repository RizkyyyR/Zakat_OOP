public class Yayasan {
        private String nama;
        private String alamat;
        private int tlp;
    
        public Yayasan(String nama, String alamat,int  tlp) {
            this.nama = nama;
            this.alamat = alamat;
            this.tlp = tlp;
        }
        public String getnama() {
            return nama;
        }
        public void setnama(String nama) {
            this.nama = nama;
        }
        public String getalamat() {
            return alamat;
        }
        public void setalamat(String alamat) {
            this.alamat = alamat;
        }
        public int gettlp() {
            return tlp;
        }
        public void settlp(int tlp) {
            this.tlp = tlp;
        }
        public void tampilkanData() {
            System.out.println("\nNama Yayasan  : " + nama);
            System.out.println("Alamat Yayasan: " + alamat);
            System.out.println("Nomor Telepon : " + tlp);
        }
    }
