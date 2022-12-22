public class Waktu {
    // Jam, menit, detik
    public int jam;
    public int menit;
    public int detik;
    public int clock;

    public Waktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public float hitung(){
        return this.clock = jam*3600 + menit*60 + detik;
    }
}
