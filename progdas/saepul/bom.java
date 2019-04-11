import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends Actor
{
    /**
     * Act - do whatever the bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(5);
        if(getY()<=5 || getY () >= getWorld().getHeight() -5)
        turn(180);
        Actor pesawat = getOneObjectAtOffset(0,0, roket.class);
        if(pesawat!= null){
            removeTouching(roket.class);
             Greenfoot.stop();
             getWorld().addObject(new kalah(), 300, 200);
           }  
        }    
}
