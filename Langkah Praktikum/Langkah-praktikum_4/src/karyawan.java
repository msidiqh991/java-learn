public class karyawan {
    private String nama;
    private int no_karyawan;
    private int bonus;
    private int total_gaji;

    public karyawan(String nama, int no_karyawan){
        this.nama = nama;
        this.no_karyawan = no_karyawan;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
        this.total_gaji = 100000;
    }

    public int getTotal() {
        return this.bonus + this.total_gaji;
    }

    public void display(){
        System.out.println("Nama Hero : " + this.nama);
        System.out.println("No Karyawan : " + this.no_karyawan);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Total gaji  : " + getTotal() + "\n");
    }
}
