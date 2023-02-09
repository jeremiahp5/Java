
/**
 * Write a description of class Dwarf here.
 *
 * Evan Painter
 * Rkk628
 */
public class Dwarf extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxStrength;
    private int currentStrength;

    /**
     * Constructor for objects of class Dwarf
     */
    public Dwarf()
    {
      maxStrength=50;
      currentStrength=50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     
     */
    public int getMaxStrength(){
        return maxStrength;
    }
    
    public int getCurrentStrength(){
        return currentStrength;
    }
    
    public void setMaxStrength(int maxSt){
        maxStrength=maxSt;
    }
    
    public void setCurrentStrength(int currentSt){
        currentStrength=currentSt;
    }
}
