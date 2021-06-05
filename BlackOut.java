
    
    public class BlackOut extends DoubleCell {
    
    private static final double Rvalue = 3.9;
   
    /**
     * Constructor for objects of class WoodBlind
     */
    public BlackOut(double height, double width, boolean cordPositionOnRight) {
       super(height, width, cordPositionOnRight);       
    }

                
    @Override
    public double getMaterialPrice() {
        return super.getMaterialPrice()+ 1.0;
    }
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
    
}

