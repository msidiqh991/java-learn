class rek {
    private int no_rek = 0;
    private int saldo;

    private int[] JumlahSaldo = new int[5];
    public rek(int no_rek, int saldo){
        this.no_rek = no_rek;
        this.saldo = saldo;
    }
    public int getNo_rek() {
        return no_rek;
    }
    public int getSaldo() {
        return saldo;
    }
    public rek(String kdRek){
        this.kd=kdRek;
    }
    public void setSaldo(int saldo) {
        JumlahSaldo[no_rek] = saldo;
        no_rek++;
    }
    public int getJumlahSaldo() {
        return this.no_rek;
    }
    public void daftarData(){
        System.out.println("Daftar Data ");
        for (int i=0; i<no_rek; i++){
            System.out.println(JumlahSaldo[i]);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        nasabah nsb = new nasabah("Muhammad Sidiq Hardiansyah", "DIY");
        rek dsn = new rek("No.rek");
        rek req1 = new rek(1,99990);
        rek req2 = new rek(2,23423);
        rek req3 = new rek(3,544356);
        rek req4 = new rek(4,2342);

        req1.setSaldo(req1.getSaldo());
        req2.setSaldo(req2.getSaldo());


        dsn.daftarData();
    }
}