
/**
 * Write a description of class NoLining here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoLining extends Curtain{
    
    private static final double Rvalue = 1.1;
           
    public NoLining(double height, double width) {
       super(height, width, Rvalue);
    }
    
    
    @Override
    public double getRvalue() {
        return Rvalue;
    }
}
