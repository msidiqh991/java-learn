public class Main {
    public static void main(String[] args) {

        Laki2 lk = new Laki2(180,47);
        System.out.println("Berat Badan Ideal : " + lk.htbbi());
        System.out.println("Tinggi Badan ideal : " + lk.htbdn());

        Perempuan pm = new Perempuan(160,60);
        System.out.println("Berat Badan Ideal : " + pm.htbbi());
        System.out.println("Tinggi Badan ideal : " + pm.htbdn());
    }
}