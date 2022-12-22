public class Manager extends ProduksiPemasaran {
    protected int TunjanganJabatan = 3500000;

    @Override
    public int getTotal() {
        return super.getTotal();
    }

    public void setGajiManager(int tunjanganJabatan) {
        this.TunjanganJabatan = tunjanganJabatan;
    }
    public int getGajiManager(){
        return super.getTotal() + TunjanganJabatan;
    }
}
