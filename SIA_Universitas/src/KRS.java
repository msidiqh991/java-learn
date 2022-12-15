public class KRS extends Matakuliah {
    private static int jmlMhs = 0;
    private int[] newNIM = new int[5];
    private int[] new_kdMK = new int[5];
    private int[] getNIDN = new int[5];

    public KRS(int kode_mk, String nama_mk, int sks, int semester) {
        super(kode_mk, nama_mk, sks, semester);
    }

    public void setNIM(int nim) {
        newNIM[jmlMhs] = nim;
        jmlMhs++;
    }

    public int setKodeMK(int kode_mk) {
        new_kdMK[jmlMhs] = kode_mk;
        jmlMhs++;
        return kode_mk;
    }

    public void setNidn(int nidn) {
        getNIDN[jmlMhs] = nidn;
        jmlMhs++;
    }
}
