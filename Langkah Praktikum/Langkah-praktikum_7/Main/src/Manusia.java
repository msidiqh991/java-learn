public abstract class Manusia {
    double tinggiBadan;
    double beratBadan;

    Manusia(double tb, double bb){
        this.tinggiBadan = tb;
        this.beratBadan = bb;
    }


    public double getBeratBadan() {
        return beratBadan;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    abstract double htbbi();

    abstract  double htbdn();
}
