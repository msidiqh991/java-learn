package tugas10;

public class kucing implements hewan{
    @Override
    public void nama() {
        System.out.println("KUCING");
    }

    @Override
    public void bunyi() {
        System.out.println("MEONG");
    }

    @Override
    public void ciri() {
        System.out.println("BERKAKI 4");
    }
}
