public abstract class Hewan implements Kandang{
    String jenis, ciri;

    public Hewan(String jenis, String ciri) {
        this.jenis = jenis;
        this.ciri = ciri;
    }

    public String getSuaraAsal(){
        return "Tidak ada suara";
    }

    public String suara(Object obj1){
        Hewan hewan1 = (Hewan) obj1;
        return(hewan1.getSuaraAsal());
    }

    abstract String suara();
}
