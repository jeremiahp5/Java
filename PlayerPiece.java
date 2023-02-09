
/**
 * Write a description of class PlayerPiece here.
 *
 * Evan Painter
 * Rkk628
 */
public class PlayerPiece extends BoardPiece
{
    // instance variables - replace the example below with your own
    private int currentHealth;
    private int maxHealth;
    private int locX;
    private int locY;
    private int attackPower;
    private int defensePower;

    /**
     * Contructor for objects of class PlayerPiece
     */
    public PlayerPiece()
    {
        // initialise instance variables
        currentHealth = 100;
        maxHealth=100;
        locX=15;
        locY=13;
        attackPower=12;
        defensePower=10;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    public int getMaxHealth()
    {
        // put your code here
        return maxHealth;
    }
    
    public int getCurrentHealth()
    {
        return currentHealth;
    }
    
    public int getLocX()
    {
        return locX;
    }
    
     public int getLocY()
    {
        return locY;
    }
    
     public int getAttackPower()
    {
        return attackPower;
    }
    
     public int getDefensePower()
    {
        return defensePower;
    }
    //left off at 16
    public void moveUp(){
        
    }
    
    public void moveDown(){
        
    }
    
    public void moveLeft(){
        
    }
    
    public void moveRight(){
        
    }


}
