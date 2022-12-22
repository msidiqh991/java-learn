package tugas10;

public class main {
    public static void main(String[] args) {
        kucing hewan1=new kucing();
        System.out.println("---------------------------------");
        System.out.println("NAMA HEWAN BESERTA CIRI CIRINYA");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.printf("NAMA HEWAN = ");
        hewan1.nama();
        System.out.printf("BERBUNYI = ");
        hewan1.bunyi();
        System.out.printf("BERCIRI = ");
        hewan1.ciri();
        System.out.println();

        kambing hewan2=new kambing();
        System.out.printf("NAMA HEWAN = ");
        hewan2.nama();
        System.out.printf("BERBUNYI = ");
        hewan2.bunyi();
        System.out.printf("BERCIRI = ");
        hewan2.ciri();
        System.out.println();


        ayam hewan3=new ayam();
        System.out.printf("NAMA HEWAN = ");
        hewan3.nama();
        System.out.printf("BERBUNYI = ");
        hewan3.bunyi();
        System.out.printf("BERCIRI = ");
        hewan3.ciri();

    }
}
