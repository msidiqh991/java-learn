public class DuaBilangan implements Operasi {
    private int bil1, bil2;

    public DuaBilangan(int angka1, int angka2) {
        bil1 = angka1;
        bil2 = angka2;
    }

    public int getBil1() {
        return bil1;
    }

    public int getBil2() {
        return bil2;
    }

    public int getPerjumlahan(){
        return bil1 + bil2;
    }
    public int getPengurangan(){
        return bil1 - bil2;
    }
    public int getPerkalian(){
        return bil1 * bil2;
    }
    public int getPembagian(){
        return bil1 / bil2;
    }

    @Override
    public int penjumlahan(Object obj1) {
        DuaBilangan db = (DuaBilangan) obj1;
        return(db.getPerjumlahan());
    }
    @Override
    public int pengurangan(Object obj1) {
        DuaBilangan db = (DuaBilangan) obj1;
        return(db.getPengurangan());
    }
    @Override
    public int perkalian(Object obj1) {
        DuaBilangan db = (DuaBilangan) obj1;
        return(db.getPerkalian());
    }
    @Override
    public int pembagian(Object obj1) {
        DuaBilangan db = (DuaBilangan) obj1;
        return(db.getPembagian());
    }
}
