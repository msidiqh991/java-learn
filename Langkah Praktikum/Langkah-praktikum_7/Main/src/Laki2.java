public class Laki2 extends Manusia {

    Laki2(double tb,double bb) {
        super(tb, bb);
    }

    @Override
    double htbbi(){
        return(super.getTinggiBadan()-100) * 0.9;
    }

    @Override
    double htbdn(){
        return(super.getBeratBadan() * 0.10);
    }
}
