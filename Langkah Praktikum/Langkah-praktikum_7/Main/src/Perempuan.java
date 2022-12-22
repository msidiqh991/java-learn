public class Perempuan extends Manusia {
    Perempuan(double tb, double bb){
        super(tb, bb);
    }

    @Override
    final double htbbi() {
        return(super.getTinggiBadan()-100) * 0.8;
    }

    @Override
    final double htbdn(){
        return (super.getBeratBadan() * 0.10);
    }

}
