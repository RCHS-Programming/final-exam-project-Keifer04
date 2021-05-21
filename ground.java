import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends World
{

    /**
     * Constructor for objects of class ground.
     * 
     */
    public ground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        addObject(new Frog(),500, 100);
        addObject(new evilFrog(),Greenfoot.getRandomNumber(800), 500);
        addObject(new demonEye(),Greenfoot.getRandomNumber(800), 550);
        addObject(new demonEye(),Greenfoot.getRandomNumber(800), 550);
        addObject(new Dragon(),Greenfoot.getRandomNumber(800), 500);
        addObject(new soundwave(),Greenfoot.getRandomNumber(800), 500);
        addObject(new goldOrb(),Greenfoot.getRandomNumber(800), 500);
        addObject(new wall2(), Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(500));
        addObject(new wall(), Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(500));
        addObject(new soundwave(),Greenfoot.getRandomNumber(800), 500);
        addObject(new Dragon(),Greenfoot.getRandomNumber(800), 500);
        addObject(new evilFrog(),Greenfoot.getRandomNumber(800), 500);
        addObject(new deathOrb(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
        addObject(new TeleportOrb(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
        addObject(new TeleportOrb(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
        addObject(new TeleportOrb(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
        addObject(new goldOrb(),Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber (600));
        addObject(new goldOrb(),Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber (600));
        addObject(new goldOrb(),Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber (600));
        
        
        
        
        
    }
}
