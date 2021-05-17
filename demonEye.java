import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class demonEye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demonEye extends Actor
{
    private int demonmove=2;
    /**
     * Act - do whatever the demonEye wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        move();
       randomTurn();
       turnAtEdge();
       istouchingWall();
    }    
    
    public void move( )
    {
        move(demonmove);
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
        
     public void istouchingWall()
      {
              {
      if (isTouching (wall.class))
       {
       demonmove=0;  
        }  
        else
        {
         demonmove=8;
        }
      if (isTouching (wall2.class))
       {
       demonmove=0;  
        }  
        else
     {
       demonmove=8;
     }
     }
     }
        }
}
