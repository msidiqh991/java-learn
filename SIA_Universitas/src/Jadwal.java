public class Jadwal {
    private int kode_jadwal = 200312;
    private String hari = "Jum'at";
    private String waktu = "10/2/2022";
    private static int jmlMhs = 0;
    private int[] Kd_MK = new int[5];
    private int[] infoNIDN = new int[5];

    public int getKode_jadwal() {
        return kode_jadwal;
    }
    public String getHari() {
        return hari;
    }
    public String getWaktu() {
        return waktu;
    }

    public int[] getKd_MK() {
        return Kd_MK;
    }

    public int[] getInfoNIDN() {
        return infoNIDN;
    }
}
