
/**
 * Abstract class SlattedBlind - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class SlattedBlind extends WindowCovering{
    
    private static final String operation = "raise, lower or tilt";
    private static final double headerPrice = 20.0;
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public SlattedBlind(double height, double width, double Rvalue,
                             double materialPrice) {
        super(height, width, operation, Rvalue, headerPrice, materialPrice);
    }
    
    public abstract int getSlatDepth();
    
    @Override
    public String getOperation() {
        return operation;
    }
    
    @Override
    public double getHeaderPrice() {
        return headerPrice;
    }
    
    @Override
    public String toString() {
        return  super.toString() + "\n" + 
                "Slat Depth(in inches): " + getSlatDepth();
    }
}
