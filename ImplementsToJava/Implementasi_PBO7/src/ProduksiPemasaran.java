public class ProduksiPemasaran extends Pegawai {
    protected int GajiHonorLembur = 250000;
    protected int Tunjangan = 1250000;
    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public void setKaryawanGaji(int GajiHonorLembur, int Tunjangan){
        this.GajiHonorLembur = GajiHonorLembur;
        this.Tunjangan = Tunjangan;
    }
    public int getTotal(){
        return super.getGaji() + (GajiHonorLembur + Tunjangan);
    }
}
