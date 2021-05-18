import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class soundwave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class soundwave extends Actor
{
    private int soundwaveSpeed=4;
    /**
     * Act - do whatever the soundwave wants to do. This method is called whenever
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
        move(soundwaveSpeed);
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
    
     public void istouchingWall()
     {
         if (isTouching (wall.class))
         {
           soundwaveSpeed=0;  
          }  
          else
           {
              soundwaveSpeed=4;
           }
          if (isTouching (wall2.class))
          {
             soundwaveSpeed=0;  
           }  
            else
         {
             soundwaveSpeed=4;
         }
     }
}
