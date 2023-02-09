
/**
 * Write a description of class Troll here.
 *
 * Evan Painter
 * Rkk628
 */
public class Troll extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxHate;
    private int currentHate;

    /**
     * Constructor for objects of class Troll
     */
    public Troll()
    {
        // initialise instance variables
        maxHate=50;
        currentHate=50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getMaxHate()
    {
        return maxHate;
    }
    
    public int getCurrentHate()
    {
        return currentHate;
    }
    
    public void setMaxHate(int maxH){
        maxHate=maxH;
    }
    
    public void setCurrentHate(int currentH){
        currentHate=currentH;}
}
