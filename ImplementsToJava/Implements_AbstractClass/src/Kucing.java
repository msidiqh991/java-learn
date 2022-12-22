public class Kucing extends Hewan {
    public Kucing(String jenis, String ciri){
        super(jenis, ciri);
    }
    @Override
    String suara() {
        return "Meow ...";
    }
}
