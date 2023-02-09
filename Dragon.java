
/**
 * Write a description of class Dragon here.
 *
 * Evan Painter
 * Rkk628
 */
public class Dragon extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxFire;
    private int currentFire;

    /**
     * Constructor for objects of class Dragon
     */
    public Dragon()
    {
       maxFire=100;
       currentFire=100;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getMaxFire()
    {
       return maxFire;
    }
    
    public int getCurrentFire()
    {
        return currentFire;
    }
    
    public void setMaxFire(int maxF){
        maxFire=maxF;
    }
    
    public void setCurrentFire(int currentF){
        currentFire=currentF;}
}
