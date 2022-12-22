public class sapi extends hewan{

    public sapi(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public String suara() {
        return "mooooooooooooooooooooooo";
    }

    @Override
    public String berjalan() {
        return "menggunakan kaki";
    }
}
