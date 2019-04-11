import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roket extends Actor
{
    /**
     * Act - do whatever the roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("left")){
            turn(-6);
        }    
        if (Greenfoot.isKeyDown("right")) {
            turn(6);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(6);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-6);
        }
        Actor bola= getOneObjectAtOffset(0,0, bola.class);
        if(bola !=null){
          getWorld() .removeObject(bola);
          score.bola++;
        }
        if(score.bola == 3){
            getWorld().addObject(new menang(), 300, 200);
            Greenfoot.stop();
        }
}    }   // Add your action code here.
       

