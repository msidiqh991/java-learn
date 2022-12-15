public abstract class Matakuliah {
    private int kode_mk;
    private String nama_mk;
    private int sks;
    private int semester;

    public Matakuliah (int kode_mk, String nama_mk, int sks, int semester) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.sks = sks;
        this.semester = semester;
    }

    public int getKode_mk() {
        return kode_mk;
    }

    public String getNama_mk() {
        return nama_mk;
    }

    public int getSks() {
        return sks;
    }

    public int getSemester() {
        return semester;
    }
}
