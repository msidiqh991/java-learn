public class nasabah {
    private String nama, alamat;
    public nasabah(String nama, String alamat){
        this.nama=nama;
        this.alamat = alamat;
    }
    public void setNama(String nama){this.nama = nama;}
    public String getNama(){return this.nama;}

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
