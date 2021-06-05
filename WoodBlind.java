
/**
 * Write a description of class WoodBlind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodBlind extends SlattedBlind {
    
    private static final double materialPrice = 16.0;
    private static final double Rvalue = 1.6;
       
    /**
     * Constructor for objects of class WoodBlind
     */
    public WoodBlind(double height, double width) {
       super(height, width, Rvalue , materialPrice);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    @Override
    public int getSlatDepth() {
        return 3;
    }
    
    @Override
    public double getHeaderPrice() {
        return super.getHeaderPrice() + 2.0;
    }
    
    @Override
    public double getMaterialPrice() {
        return materialPrice;
    }
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
    
    
}
