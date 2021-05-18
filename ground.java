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
        addObject(new evilFrog(),500, 500);
        addObject(new demonEye(),550, 550);
        addObject(new Dragon(),600, 500);
        addObject(new soundwave(),800, 500);
        addObject(new goldOrb(),400, 500);
    }
}
