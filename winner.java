import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winner extends Actor
{
    /**
     * Act - do whatever the winner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void p1Wins()
    {
        setLocation(366,383);
        setImage("p1Wins.bmp");
    }
    public void p2Wins()
    {
        setLocation(366,383);
        setImage("p2Wins.bmp");
    }
}
