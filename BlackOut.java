
    
    public class BlackOut extends DoubleCell {
    
    private static final double Rvalue = 3.9;
   
    public BlackOut(double height, double width, CordStyle style, boolean cordPositionOnRight){
        super (height, width, style, cordPositionOnRight);
        setCordStyle(style);
        setCordPositionOnRight(cordPositionOnRight);
    }
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
    
    @Override
    public double getMaterialPrice() {
        return super.getMaterialPrice() + 1.0;
    }
    
    
}

