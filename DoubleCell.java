
/**
 * Write a description of class DoubleCell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleCell extends HoneycombShade {
    private static final double headerPrice = 19.0;
    private static final double materialPrice = 15.0;
    private static final double Rvalue = 2.7;
    private CordStyle style;
    private boolean cordPositionOnRight;
    private double updatedHeaderPrice;

    public DoubleCell(double height, double width, CordStyle style, boolean cordPositionOnRight){
        super (height, width, Rvalue, headerPrice, materialPrice);
        setCordStyle(style);
        setCordPositionOnRight(cordPositionOnRight);
    }

    public void setCordStyle(CordStyle style) {
        this.style = style;
    }

    /**
     * cord position true on right, false on left
     */
    public void setCordPositionOnRight(boolean cordPositionOnRight){
        this.cordPositionOnRight = cordPositionOnRight;
    }

    @Override
    public CordStyle getCordStyle() {
        return style;
    }

    @Override
    public double getHeaderPrice() {
        switch(style) {
            case PULL:       updatedHeaderPrice = headerPrice       ; break;
            case CONTINUOUS: updatedHeaderPrice = headerPrice + 2.0 ; break;
        }
        return updatedHeaderPrice;
    }

    @Override
    public double getMaterialPrice() {
        return materialPrice;
    }

    public boolean getCordPositionOnRight() {
        return cordPositionOnRight;
    }


    @Override
    public double getRvalue() {
        return Rvalue;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" + 
        "Cord Position on right: " + getCordPositionOnRight();
    }
}
