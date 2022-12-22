import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Waktu clock = new Waktu(15, 05, 20);
        System.out.println("Jam : " +clock.jam + " Menit : " + clock.menit + " Detik : " + clock.detik);
        System.out.println("Konversi : " + clock.hitung());
    }
}