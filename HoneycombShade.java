
/**
 * Abstract class HoneycombShade - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class HoneycombShade extends WindowCovering {
    private static final String operation = "Operation options are: raise or lower";
    private CordStyle style;
    
    public enum CordStyle {
        PULL,
        CONTINUOUS
    }
            
    public HoneycombShade(double height, double width, double Rvalue, 
                          double headerPrice, double materialPrice) {
        super(height, width, operation, Rvalue, headerPrice, materialPrice);
    
    }
    
    public abstract CordStyle getCordStyle();
    
    @Override
    public String getOperation() {
        return operation;
    }
    
    @Override
    public String toString() {
        return  super.toString() + "\n" + 
                "Cord Style: " + getCordStyle();
    }
}
