public class hewan {
    String jenis,ciri;

    public hewan(String jenis,String ciri){
        this.jenis=jenis;
        this.ciri=ciri;
    }
    public String suara(){
        return "tidak bersuara";
    }
    public String berjalan(){
        return "tidak berjalan";
    }
}
