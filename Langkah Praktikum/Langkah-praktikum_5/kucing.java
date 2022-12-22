public class kucing extends hewan{
    public kucing(String jenis,String ciri){
        super(jenis, ciri);
    }

    @Override
    public String suara() {
        return "meow";
    }

    @Override
    public String berjalan() {
        return "menggunakan kaki";
    }
}
