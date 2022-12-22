public class Main {
    public static void main(String[] args) {
        hewan a= new hewan("default","default");
        System.out.println("============HEWAN============");
        System.out.println("JENIS   : "+a.jenis);
        System.out.println("CIRI    : "+a.ciri);
        System.out.println("SUARA   : "+a.suara());
        System.out.println("JALAN   : "+a.berjalan());

        System.out.println();
        System.out.println("===========KUCING============");
        kucing oren =new kucing("kampung","berkaki");
        System.out.println("JENIS KUCING  : "+oren.jenis);
        System.out.println("CIRI  KUCING  : "+oren.ciri);
        System.out.println("SUARA KUCING  : "+oren.suara());
        System.out.println("JALAN KUCING  : "+oren.berjalan());

        System.out.println();
        System.out.println("===========SAPI==============");
        sapi metal =new sapi("metal","berkaki");
        System.out.println("JENIS SAPI  : "+metal.jenis);
        System.out.println("CIRI  SAPI  : "+metal.ciri);
        System.out.println("SUARA SAPI  : "+metal.suara());
        System.out.println("JALAN SAPI  : "+metal.berjalan());
    }
}