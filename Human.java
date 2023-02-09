
/**
 * Write a description of class Human here.
 *
 * Evan Painter
 * Rkk628
 */
public class Human extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxSpirit;
    private int currentSpirit;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // initialise instance variables
        maxSpirit = 50;
        currentSpirit=50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * 
     * 
     */
    public int getMaxSpirit(){
        return maxSpirit;
    }
    
    public int getCurrentSpirit(){
        return currentSpirit;
    }
    
    public void setMaxSpirit(int maxS){
        maxSpirit=maxS;
    }
    
    public void setCurrentSpirit(int currentS){
        currentSpirit=currentS;
    }
}
