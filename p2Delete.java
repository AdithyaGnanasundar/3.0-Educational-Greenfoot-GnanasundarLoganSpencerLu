import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p2Delete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2Delete extends p2
{
    /**
     * Act - do whatever the p2Delete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean deleted = false;
    public void act() 
    {
        if (!deleted) {
            map raceMap3 = (map) getWorld();
            p2 P2 = raceMap3.P2;
            setLocation(P2.getX(),P2.getY());
        } else {
            removeTouching(p2.class);
            map raceMap = (map) getWorld();
            winner Winner = raceMap.winner;
            Winner.p1Wins();
            getWorld().removeObject(this);
        }
        
    }    
    public void endP2()
    {
        deleted = true;
    }
}
