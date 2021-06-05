public class LightLining extends Curtain{
    
    private static final double Rvalue = 1.5;
           
    public LightLining(double height, double width) {
       super(height, width, Rvalue);
    }
    
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
    
    @Override
    public double getMaterialPrice() {
        return super.getMaterialPrice() + 2.0;
    }
}
