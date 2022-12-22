public class Persegi {
    public float panjang;
    public float lebar;
    public float total;

    // constructor
    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    // method
    public float hitung(){
        return this.total = this.panjang * this.lebar;
    }
}
