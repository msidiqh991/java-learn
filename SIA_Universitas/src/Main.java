public class Main {
    public static void main(String[] args) {

        Dosen ds = new Dosen();
        System.out.println("\nSistem Informasi Akademik - UAD \n===============================");

        // Tabel Dosen
        System.out.println("\nTabel Dosen \n==============");
        System.out.println("Nama dosen : " + ds.getNama_dosen());
        System.out.println("Kode dosen : " + ds.getNidn());

        // Tabel Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        mhs.getDataMhs("Muhammad Sidiq",2100018399,"Teknik Informatika");

        System.out.println("\nTabel Mahasiswa \n===============");
        System.out.println("NIM Mahasiswa  : " + mhs.getNim());
        System.out.println("Nama Mahasiswa : " +mhs.getNama_mhs());
        System.out.println("Program Studi  : " + mhs.getProdi());

        // Tabel Matakuliah
        KRS mk = new KRS(3033,"PBO",3,3);

        System.out.println("\nTabel Matakuliah \n================");
        System.out.println("Kode matkul : " + mk.getKode_mk());
        System.out.println("Nama matkul : " + mk.getNama_mk());
        System.out.println("Jumlah SKS  : " + mk.getSks());
        System.out.println("Semester    : " + mk.getSemester());

        // Tabel partial --> KRS
        System.out.println("\nTabel KRS \n==============");
        System.out.println("Kode matkul : " + mk.getKode_mk());
        System.out.println("NIM Mhs     : " + mhs.getNim());
        System.out.println("Jumlah SKS  : " + mk.getSks());

        // Tabel partial --> Jadwal
        Jadwal jdl = new Jadwal();

        System.out.println("\nTabel Jadwal \n==============");
        System.out.println("Kd Jadwal : " + jdl.getKode_jadwal());
        System.out.println("Kode MK   : " + mk.getKode_mk());
        System.out.println("NIDN      : " + ds.getNidn());
        System.out.println("Hari      : " + jdl.getHari());
        System.out.println("Waktu     : " + jdl.getWaktu());
    }
}