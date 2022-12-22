public class Main {
    public static void main(String[] args) {
        Manager Karyawan = new Manager();

        // Menentukan Nama dan Gaji Karyawan
        Karyawan.getData("Udin", 150000);
        // Output -> keluaran data
        System.out.println(Karyawan.getDetails());
    }
}