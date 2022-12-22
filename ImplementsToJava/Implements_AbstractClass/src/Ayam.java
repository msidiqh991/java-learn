public class Ayam extends Hewan {
    public Ayam(String jenis, String ciri) {
        super(jenis, ciri);
    }
    @Override
    String suara() {
        return "Kukuruyukk ...";
    }
}
