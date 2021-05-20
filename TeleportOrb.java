import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeleportOrb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeleportOrb extends Actor
{
    /**
     * Act - do whatever the TeleportOrb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(demonEye.class))
           {
              setLocation(Greenfoot.getRandomNumber (800), Greenfoot.getRandomNumber (500));
              
            }
    }    
    
    
}
