import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p1Delete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p1Delete extends p1
{
    /**
     * Act - do whatever the p1Delete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean deleted = false;
    public void act() 
    {
        if (!deleted) {
            map raceMap3 = (map) getWorld();
            p1 P1 = raceMap3.P1;
            setLocation(P1.getX(),P1.getY());
        } else {
            removeTouching(p1.class);
            map raceMap = (map) getWorld();
            winner Winner = raceMap.winner;
            Winner.p2Wins();
            getWorld().removeObject(this);
        }
    }    
    public void endP1()
    {
        deleted = true;
    }
}
