import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Actor
{
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       move();
       randomTurn();
       turnAtEdge();
       if (isTouching(demonEye.class))
           {
              setLocation(Greenfoot.getRandomNumber (800), Greenfoot.getRandomNumber (500));
              
            }
       if (isTouching(TeleportOrb.class))
           {
               setLocation(Greenfoot.getRandomNumber (800), Greenfoot.getRandomNumber (500));
            } 
       if (isTouching(deathOrb.class))
           {
              getWorld().removeObject(this);
            }
            
    }    
    
     public void move( )
    {
        move(4);
    }
    
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10 )
       {
           turn(Greenfoot.getRandomNumber(91) -45 );
       } 
    }
    
     public void turnAtEdge()
    {
     if( isAtEdge())
        {
            turn (-17);
            
        }   
    }
    
    
    
    
}

