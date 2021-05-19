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
    private int XSpeed=8;
    private int YSpeed=8;
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
            setLocation( getX(), getY() -YSpeed);
        }   
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +YSpeed );
        }    
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +XSpeed, getY() );
        }    
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -XSpeed, getY() );
        }  
    }
    
    public void enemyCollision()
    { 
        {
           if (isTouching(demonEye.class))
           {
              removeTouching(Frog.class);
              setLocation( 500, 100);
            }
           if (isTouching(Dragon.class))
           {
              removeTouching(Frog.class);
              setLocation(500, 100);
           }
           if (isTouching(evilFrog.class))
           {
              removeTouching(Frog.class);
              setLocation(500, 100);
           }
           if (isTouching(soundwave.class))
           {
              removeTouching(Frog.class);
              setLocation(500, 100);
           }
           if (isTouching(deathOrb.class))
           {
              removeTouching(Frog.class);
              setLocation(500, 100);
           }
           if (isTouching(TeleportOrb.class))
           {
               setLocation(Greenfoot.getRandomNumber (800), Greenfoot.getRandomNumber (500));
            }
        }
    }
    
    public void istouchingWall()
    {
     {
         if (isTouching (wall.class))
         {
           YSpeed=0;  
        }  
        else
        {
            YSpeed=8;
        }
        if (isTouching (wall2.class))
         {
           XSpeed=0;  
        }  
        else
        {
            XSpeed=8;
        }
    }
}
    
             public void lookForgoldOrb()
         {
             if(isTouching(goldOrb.class))
      {
           removeTouching(goldOrb.class);
           
           
           getWorld().showText("You Win: " + FrogEat, 50, 500);
           
           
           if ( FrogEat ==2)
           {
               Greenfoot.stop();
            }
        } 
}
}
