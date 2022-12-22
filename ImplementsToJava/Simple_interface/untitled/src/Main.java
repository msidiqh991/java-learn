public class Main {
    public static void main(String[] args) {

        DuaBilangan db = new DuaBilangan(20,50);

        System.out.println("Bilangan Pertama : " + db.getBil1());
        System.out.println("Bilangan Pertama : " + db.getBil2());

        System.out.println("\n = Operasi = ");
        System.out.println("Perjumlahan : " + db.getBil1() + " dan "
        + db.getBil2() + " = " + db.getPerjumlahan());
        System.out.println("Pengurangan : " + db.getBil1() + " dan "
                + db.getBil2() + " = " + db.getPengurangan());
        System.out.println("Perkalian : " + db.getBil1() + " dan "
                + db.getBil2() + " = " + db.getPerkalian());
        System.out.println("Pembagian : " + db.getBil1() + " dan "
                + db.getBil2() + " = " + db.getPembagian());

    }
}