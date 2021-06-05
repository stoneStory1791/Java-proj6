public class NormalLining extends Curtain{
    
    private static final double Rvalue = 1.8;
           
    public NormalLining(double height, double width) {
       super(height, width, Rvalue);
    }
    
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
    
    @Override
    public double getMaterialPrice() {
        return super.getMaterialPrice() + 3.0;
    }
}
