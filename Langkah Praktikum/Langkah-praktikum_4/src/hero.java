public class hero {
    private String nama;
    private int darah;
    private String nama_armor;
    private int kekuatan;

    public hero(String nama){
        this.nama = nama;
        darah = 100;
    }

    public void setArmor(String nama_armor, int kekuatan) {
        this.nama_armor = nama_armor;
        this.kekuatan = kekuatan;
    }

    public int getDarahmaks() {
        return this.kekuatan + this.darah;
    }

    public void display(){
        System.out.println("Nama Hero : " + this.nama);
        System.out.println("Darah Bawaan : " + this.darah);
        System.out.println("Nama Armor : " + this.nama_armor);
        System.out.println("Darah Max  : " + getDarahmaks() + "\n");
    }
}
