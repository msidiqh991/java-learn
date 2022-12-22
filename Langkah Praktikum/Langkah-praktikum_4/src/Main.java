public class Main {
    public static void main(String[] args) {
        karyawan p1 = new karyawan("Septiana", 2100018399);
        p1.setBonus(50000);

        karyawan p2 = new karyawan("Sidiq", 12749812);
        p2.setBonus(25000);

        p1.display();
        p2.display();
    }
}