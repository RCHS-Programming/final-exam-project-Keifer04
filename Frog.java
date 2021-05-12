import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        playerMovement();
        enemyCollision();
    }    
    
    public void playerMovement()
    {
         if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3);
        }   
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +3 );
        }    
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +3, getY() );
        }    
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -3, getY() );
        }  
    }
    
    public void enemyCollision()
    {
     
        
    {
           if (isTouching(demonEye.class))
           {
              removeTouching(Frog.class);
              setLocation( 100, 100);
            }
           if (isTouching(Dragon.class))
           {
              removeTouching(Frog.class);
              setLocation(100, 100);
           }
           if (isTouching(evilFrog.class))
           {
              removeTouching(Frog.class);
              setLocation(100, 100);
           }
           if (isTouching(soundwave.class))
           {
              removeTouching(Frog.class);
              setLocation(100, 100);
           }
           if (isTouching(deathOrb.class))
           {
              removeTouching(Frog.class);
              setLocation(100, 100);
           }
    }
    }
}
