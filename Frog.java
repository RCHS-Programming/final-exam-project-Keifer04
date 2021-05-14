import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    
    private int FrogEat;
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        playerMovement();
        enemyCollision();
        istouchingWall();
        lookForgoldOrb();
    }    
    
    public void playerMovement()
    {
         if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -6);
        }   
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +6 );
        }    
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +6, getY() );
        }    
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -6, getY() );
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
    
    public void istouchingWall()
    {
     {
         
        }  
    }
    
         public void lookForgoldOrb()
    {
      if(isTouching(goldOrb.class))
       {
           removeTouching(goldOrb.class);
           Greenfoot.playSound("slurp.wav");
           
           
           getWorld().showText("Score: " + FrogEat, 50, 500);
           
           
           if ( FrogEat ==8)
           {
               Greenfoot.stop();
            }
        } 
}
}
