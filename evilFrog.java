import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class evilFrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class evilFrog extends Actor
{
    
    private int evilFrog=7;
    /**
     * Act - do whatever the evilFrog wants to do. This method is called whenever
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
        move(evilFrog);
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
            turn (17);
            
        }    
    }
    
    public void istouchingWall()
     {
         if (isTouching (wall.class))
         {
           evilFrog=0;  
          }  
          else
           {
              evilFrog=7;
           }
          if (isTouching (wall2.class))
          {
             evilFrog=0;  
           }  
            else
         {
             evilFrog=7;
         }
     }
}
