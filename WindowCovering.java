
/**
 * Write a description of class WalWindowCovering here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class WindowCovering{
    //---------------------------------------------------------------
    //      STATIC METHODS
    //---------------------------------------------------------------
    // public static double calcTotalPrice(double height, double width) {
    // double totalPrice = height * width;
    // return totalPrice;
    // }

    private double width;
    private double height;
    private String operation;
    private double Rvalue;
    private double headerPrice;
    private double materialPrice;

    //---------------------------------------------------------------
    //      CONSTRUCTORS
    //---------------------------------------------------------------
    /**
     * Constructor for objects of class WalWindowCovering
     */
    public WindowCovering(double height, double width, String operation, double Rvalue,
    double headerPrice, double materialPrice){
        setHeight(height);
        setWidth(width);
        this.operation = operation;
        this.Rvalue = Rvalue;
        this.headerPrice = headerPrice;
        this.materialPrice = materialPrice;
    }
    //---------------------------------------------------------------
    //      GET METHODS
    //---------------------------------------------------------------
    public abstract String getOperation();

    public abstract double getRvalue();

    public abstract double getHeaderPrice();

    public abstract double getMaterialPrice();
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    //---------------------------------------------------------------
    //      SET METHODS
    //---------------------------------------------------------------
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setWidth(double width) {
        if ((width % 0.125) != 0  || width <= 0) {
            throw new IllegalArgumentException("width must be greater than 0 and with measurement unit as 1/8");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if ((height % 0.125) != 0  || height <= 0) {
            throw new IllegalArgumentException("width must be greater than 0 and with measurement unit as 1/8");
        }
        this.height = height;
    }

    public String calcTotalPrice() {
        double totalPrice = getHeaderPrice() + getMaterialPrice(); //*******************NEED TO CHANGE******************************* + materialPrice
        return "header price: " + getHeaderPrice() + 
               "  material price:" + getMaterialPrice() +
               "  total price: " + totalPrice;
    }

    public String toString() { 
        // return   String.format("For %s option, Width from customer: %d\nHeight from customer: %d\nOperation provided: %s\nTotal Price: %d\nInsulation value(R-value): %d\n",
            // getClass().getName(), this.getWidth(), this.getHeight(), getOperation(), calcTotalPrice(), getRvalue());
        return   "Window type: "             + getClass().getName()  + "\n" + 
        "Width from customer(in inches): "   + getWidth()            + "\n" + 
        "Height from customer(in inches): "  + getHeight()           + "\n" + 
        "Operation provided: "               + getOperation()        + "\n" + 
        "Total Price(per sqare foot): $"     + calcTotalPrice()      + "\n" + 
        "Insulation value(R-value): "        + getRvalue()       ;

       
    }
}
