import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     static int bola = 0;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage("Jumlah bola = "+bola, 36, Color.RED, null);
        setImage(image);
    }    
}
