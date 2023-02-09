
/**
 * Write a description of class Elf here.
 *
 * Evan Painter
 * Rkk628
 */
public class Elf extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxMagic;
    private int currentMagic;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        maxMagic = 50;
        currentMagic=50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    public int getMaxMagic(){
        return maxMagic;
    }
    
    public int getCurrentMagic(){
       return currentMagic; 
    }
    
    public void setMaxMagic(int maxM){
        maxMagic=maxM;
    }
    
    public void setCurrentMagic(int currentM){
        currentMagic=currentM;
    }
}
