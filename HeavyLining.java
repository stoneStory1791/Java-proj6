public class HeavyLining extends Curtain{
    
    private static final double Rvalue = 2.1;
           
    public HeavyLining(double height, double width) {
       super(height, width, Rvalue);
    }
    
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
    
    @Override
    public double getMaterialPrice() {
        return super.getMaterialPrice() + 4.0;
    }
    
    @Override
    public double getHeaderPrice() {
        return super.getHeaderPrice() + 3.0;
    }
}