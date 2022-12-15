public class Mahasiswa {
    private String nama_mhs;
    private int nim;
    private String prodi;

    public void getDataMhs(String nama_mhs, int nim, String prodi){
        this.nama_mhs = nama_mhs;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }
    public int getNim() {
        return nim;
    }
    public String getProdi() {
        return prodi;
    }
}
