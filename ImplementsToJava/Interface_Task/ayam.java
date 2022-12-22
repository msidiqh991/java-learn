package tugas10;

public class ayam implements hewan{
    @Override
    public void nama() {
        System.out.println("AYAM");
    }

    @Override
    public void bunyi() {
        System.out.println("PETOK");
    }

    @Override
    public void ciri() {
        System.out.println("BERKAKI 2");
    }
}
