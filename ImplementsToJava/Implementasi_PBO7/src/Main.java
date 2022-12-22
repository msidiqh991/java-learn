public class Main {
    public static void main(String[] args) {
        Pegawai karyawan = new Pegawai();
        ProduksiPemasaran bagProduksi = new ProduksiPemasaran();
        Manager bagManajer = new Manager();

            // Output data
            System.out.println(" No.Pegawai : " + karyawan.getNo_pegawai());
            System.out.println(" Nama karyawan : " + karyawan.getNama());
            System.out.println(" Bidang kerja : " + karyawan.getBidang_kerja());
            System.out.println(" Gaji tetap : Rp." + karyawan.getGaji());

            // Gaji karyawan -> Produksi & Pemasaran
            System.out.println("\n Keterangan Gaji \n -------------- ");
            System.out.println(" Gaji Honor-lembur : " + bagProduksi.GajiHonorLembur);
            System.out.println(" Gaji Tunjangan : " + bagProduksi.Tunjangan);
            System.out.println(" Gaji Pegawai bagian Pemasaran & Produksi : Rp." + bagProduksi.getTotal());

            // Gaji Manager
            System.out.println(" - \n Tunjangan Jabatan : " + bagManajer.TunjanganJabatan);
            System.out.println(" Gaji Manager : Rp." + bagManajer.getGajiManager());

    }
}