public class Main {
    public static void main(String[] args) {

        Kambing goat = new Kambing("Kambing", "Bertanduk 2");
        System.out.println("\n=== Ciri & Jenis hewan ===\n");
        System.out.println("Jenis Hewan   : " + goat.jenis);
        System.out.println("Ciri Hewan    : " + goat.ciri);
        System.out.println("Suara Hewan   : " + goat.suara());

        Kucing cat = new Kucing("Kucing", "Memiliki ekor, dan berkumis");
        System.out.println("\nJenis Hewan   : " + cat.jenis);
        System.out.println("Ciri Hewan    : " + cat.ciri);
        System.out.println("Suara Hewan   : " + cat.suara());

        Ayam Chicken = new Ayam("Ayam", "Berkaki 2, dan Bertelur");
        System.out.println("\nJenis Hewan   : " + Chicken.jenis);
        System.out.println("Ciri Hewan    : " + Chicken.ciri);
        System.out.println("Suara Hewan   : " + Chicken.suara());
    }
}