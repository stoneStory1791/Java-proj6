
public abstract class Curtain extends WindowCovering{
    private static final String operation = "slide";
    private static final double headerPrice = 9.0;
    private static final double materialPrice = 7.0;
    
    public Curtain(double height, double width, double Rvalue) {
        super(height, width, operation, Rvalue, headerPrice, materialPrice);
    }
    
    @Override
    public double getHeaderPrice(){
        return headerPrice;
    }
    
    @Override
    public String getOperation() {
        return operation;
    }
    
    @Override
    public double getMaterialPrice(){
        return materialPrice;
    }
}
